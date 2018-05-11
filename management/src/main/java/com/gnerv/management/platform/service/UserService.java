package com.gnerv.management.platform.service;


import com.gnerv.management.platform.model.User;

import java.util.List;

/**
 * <p>
 * 平台用户表 服务类
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public interface UserService {

    /**
     * 根据用户对象 新建一个用户
     * @param user
     * @return
     */
    boolean insertUser(User user);

    /**
     * 根据用户id 删除一个用户
     * @param userId
     * @return
     */
    boolean deleteUserByUserId(String userId);

    /**
     * 根据用户对象 更新一个用户
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 根据用户id 获取一个用户
     * @param userId
     * @return
     */
    User getUserByUserId(String userId);

    /**
     * 根据用户对象 模糊查询用户列表
     * @param user
     * @return
     */
    List<User> listUser(User user);

    /**
     * 查询全部用户
     * @return
     */
    List<User> listAllUser();

    /**
     * 检查账户是否可用
     * @param account
     * @return true 可用 false 不可用
     */
    boolean checkAccount(String account);
}
