package com.gnerv.management.platform.mapper;


import com.gnerv.management.platform.model.Org;

import java.util.List;

/**
 * <p>
 * 平台组织表 Mapper 接口
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public interface OrgMapper {

    /**
     * 根据组织对象 新建一个组织
     * @param org
     * @return
     */
    int insertOrg(Org org);

    /**
     * 根据组织id 删除一个组织
     * @param orgId
     * @return
     */
    int deleteOrgByOrgId(String orgId);

    /**
     * 根据组织对象 更新一个组织
     * @param org
     * @return
     */
    int updateOrg(Org org);

    /**
     * 根据组织id 获取一个组织
     * @param orgId
     * @return
     */
    Org getOrgByOrgId(String orgId);

    /**
     * 根据组织对象 模糊查询组织列表
     * @param org
     * @return
     */
    List<Org> listOrg(Org org);

    /**
     * 查询全部组织
     * @return
     */
    List<Org> listAllOrg();

}
