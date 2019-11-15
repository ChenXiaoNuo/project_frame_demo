package com.aidancloud.demo.mapper;

import com.aidancloud.demo.entity.SysUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author hutao
 * @date 2019-11-14 16:10
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    List<Long> getRoleListByUserId(Long userId);

}
