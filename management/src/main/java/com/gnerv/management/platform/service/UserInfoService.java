package com.gnerv.management.platform.service;


import com.gnerv.management.platform.model.UserInfo;

import java.util.List;

/**
 * <p>
 * 平台用户信息表 服务类
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public interface UserInfoService {

    /**
     * 根据用户信息对象 新建一个用户
     * @param userInfo
     * @return
     */
    boolean insertUserInfo(UserInfo userInfo);

    /**
     * 根据用户id 删除一个用户信息
     * @param userId
     * @return
     */
    boolean deleteUserInfoByUserId(String userId);

    /**
     * 根据用户信息对象 更新一个用户信息
     * @param userInfo
     * @return
     */
    boolean updateUserInfo(UserInfo userInfo);

    /**
     * 根据用户id 获取一个用户信息
     * @param userId
     * @return
     */
    UserInfo getUserInfoByUserId(String userId);

    /**
     * 根据用户信息对象 模糊查询用户信息列表
     * @param userInfo
     * @return
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);

    /**
     * 查询全部用户信息
     * @return
     */
    List<UserInfo> listAllUserInfo();

}
