package com.aidancloud.demo.entity;

import lombok.Data;

/**
 * 后台权限表
 * @author hutao
 * @date 2019-11-13 16:39
 */
@Data
public class SysPermission {

    private Long id;//主键
    private String menuCode;//菜单标识，前端判断并展示菜单使用
    private String menuName;//菜单名称
    private String permissionCode;//权限的代码/通配符，用来@RequeiresPermissions的value
    private String permissionName;//权限对应的释义
    private Integer requiredPermission;//是否本菜单必须权限，1必选，2非必选，通常"列表"权限是必选 默认2
    private Long parentId;//父菜单id 默认0,为顶级菜单
    private Integer sort;//菜单和权限排序

}
