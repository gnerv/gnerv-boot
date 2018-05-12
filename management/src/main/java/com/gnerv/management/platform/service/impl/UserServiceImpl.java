package com.gnerv.management.platform.service.impl;

import com.gnerv.management.platform.mapper.UserInfoMapper;
import com.gnerv.management.platform.mapper.UserMapper;
import com.gnerv.management.platform.model.User;
import com.gnerv.management.platform.model.UserInfo;
import com.gnerv.management.platform.service.UserService;
import com.gnerv.management.util.UUIDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 平台用户表 服务实现类
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public boolean insertUser(User user) {
        user = createUserModel(user);
        int i = userMapper.insertUser(user);
        UserInfo userInfo = user.getUserInfo();
        if (i == 1){
            userInfo.setUserId(user.getUserId());
            userInfoMapper.insertUserInfo(userInfo);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserByUserId(String userId) {
        int i = userMapper.deleteUserByUserId(userId);
        if (i == 1){
            userInfoMapper.deleteUserInfoByUserId(userId);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        int i = userMapper.updateUser(user);
        if (i == 1){
            userInfoMapper.updateUserInfo(user.getUserInfo());
            return true;
        }
        return false;
    }

    @Override
    public User getUserByUserId(String userId) {
        User userByUserId = userMapper.getUserByUserId(userId);
        UserInfo userInfoByUserId = userInfoMapper.getUserInfoByUserId(userId);
        userByUserId.setUserInfo(userInfoByUserId);
        return userByUserId;
    }

    @Override
    public List<User> listUser(User user) {
        List<User> users = userMapper.listUser(user);
        for (User u : users) {
            UserInfo userInfoByUserId = userInfoMapper.getUserInfoByUserId(u.getUserId());
            u.setUserInfo(userInfoByUserId);
        }
        return users;
    }

    @Override
    public List<User> listAllUser() {
        List<User> users = userMapper.listAllUser();
        for (User u : users) {
            UserInfo userInfoByUserId = userInfoMapper.getUserInfoByUserId(u.getUserId());
            u.setUserInfo(userInfoByUserId);
        }
        return users;
    }

    @Override
    public boolean checkAccount(String account) {
        int i = userMapper.checkAccount(account);
        if (i == 0){
            return true;
        }
        return false;
    }

    private User createUserModel(User user) {
        user.setUserId(UUIDUtils.getUUIDToLowercaseNoLine());
        if (StringUtils.isEmpty(user.getUserStatus())) {
            user.setUserStatus("1");
        }
        return user;
    }
}
