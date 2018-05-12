package com.gnerv.management.platform.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 平台用户信息表
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认索引 不可作用于业务
     */
    private Long id;
    /**
     * 用户唯一32位UUID 
     */
    private String userId;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户邮箱
     */
    private String userMail;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
