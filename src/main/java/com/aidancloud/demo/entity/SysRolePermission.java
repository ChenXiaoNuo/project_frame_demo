package com.aidancloud.demo.entity;

import lombok.Data;

/**
 * 后台角色权限关联表,多对多
 * @author hutao
 * @date 2019-11-13 16:56
 */
@Data
public class SysRolePermission {

    private Long id;
    private Long roleId;//角色id
    private Long permissionId;//资源权限id
}
