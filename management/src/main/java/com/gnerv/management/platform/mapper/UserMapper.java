package com.gnerv.management.platform.mapper;


import com.gnerv.management.platform.model.User;

import java.util.List;

/**
 * <p>
 * 平台用户表 Mapper 接口
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public interface UserMapper {

    /**
     * 根据用户对象 新建一个用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 根据用户id 删除一个用户
     * @param userId
     * @return
     */
    int deleteUserByUserId(String userId);

    /**
     * 根据用户对象 更新一个用户
     * @param user
     * @return
     */
    int updateUser(User user);

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
     * 检查账户是否存在
     * @param account
     * @return 非0 存在 0 不存在
     */
    int checkAccount(String account);
}
