package com.aidancloud.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户角色关联表-多对多
 * @author hutao
 * @date 2019-11-13 16:58
 */
@Data
@TableName("sys_user_role")
public class SysUserRole {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long userId;//用户id

    private Long roleId;//角色id
}
