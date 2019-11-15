package com.aidancloud.demo.service;

import com.aidancloud.core.base.protocol.param.QueryPage;
import com.aidancloud.core.base.protocol.param.QueryParam;
import com.aidancloud.demo.entity.SysRole;

/**
 * @author hutao
 * @date 2019-11-14 15:13
 */
public interface SysRoleService {

    QueryPage<SysRole> getSysRoleList(QueryParam queryParam);

    SysRole getSysRole(Long id);


}
