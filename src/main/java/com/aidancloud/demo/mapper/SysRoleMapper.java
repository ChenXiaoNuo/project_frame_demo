package com.aidancloud.demo.mapper;

import com.aidancloud.demo.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * @author hutao
 * @date 2019-11-07 14:18
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    IPage<SysRole> getRoleList(Page page);

}
