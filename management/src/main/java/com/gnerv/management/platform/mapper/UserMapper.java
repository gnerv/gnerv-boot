package com.gnerv.management.platform.mapper;


import com.gnerv.management.platform.model.User;

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


}
