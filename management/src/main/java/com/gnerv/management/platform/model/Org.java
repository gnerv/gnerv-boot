package com.gnerv.management.platform.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 平台组织表
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public class Org implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认索引 不可作用于业务
     */
    private Long id;
    /**
     * 组织唯一32位UUID
     */
    private String orgId;
    /**
     * 上级组织id
     */
    private String pId;
    /**
     * 组织编码
     */
    private String orgCode;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 组织简称
     */
    private String orgAbbreviation;
    /**
     * 组织排序
     */
    private String orgSort;
    /**
     * 组织状态 : 0启用 1停用 2锁定 3删除
     */
    private String userStatus;
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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAbbreviation() {
        return orgAbbreviation;
    }

    public void setOrgAbbreviation(String orgAbbreviation) {
        this.orgAbbreviation = orgAbbreviation;
    }

    public String getOrgSort() {
        return orgSort;
    }

    public void setOrgSort(String orgSort) {
        this.orgSort = orgSort;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
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
        return "Org{" +
                "id=" + id +
                ", orgId='" + orgId + '\'' +
                ", pId='" + pId + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", orgAbbreviation='" + orgAbbreviation + '\'' +
                ", orgSort='" + orgSort + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
