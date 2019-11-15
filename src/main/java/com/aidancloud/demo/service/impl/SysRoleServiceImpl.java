package com.aidancloud.demo.service.impl;

import com.aidancloud.core.base.protocol.param.QueryPage;
import com.aidancloud.core.base.protocol.param.QueryParam;
import com.aidancloud.demo.entity.SysRole;
import com.aidancloud.demo.mapper.SysRoleMapper;
import com.aidancloud.demo.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hutao
 * @date 2019-11-14 15:19
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public QueryPage<SysRole> getSysRoleList(QueryParam queryParam) {
        return null;
    }

    @Override
    public SysRole getSysRole(Long id) {
        return null;
    }
}
