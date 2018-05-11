package com.gnerv.management.platform.service.impl;

import com.gnerv.management.platform.mapper.UserMapper;
import com.gnerv.management.platform.model.User;
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

    @Override
    public boolean insertUser(User user) {
        user = createUserModel(user);
        int i = userMapper.insertUser(user);
        if (i == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserByUserId(String userId) {
        int i = userMapper.deleteUserByUserId(userId);
        if (i == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        int i = userMapper.updateUser(user);
        if (i == 1){
            return true;
        }
        return false;
    }

    @Override
    public User getUserByUserId(String userId) {
        return userMapper.getUserByUserId(userId);
    }

    @Override
    public List<User> listUser(User user) {
        return userMapper.listUser(user);
    }

    @Override
    public List<User> listAllUser() {
        return userMapper.listAllUser();
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
