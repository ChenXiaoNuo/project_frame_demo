package com.aidancloud.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 后台角色表
 * @author hutao
 * @date 2019-11-13 16:50
 */
@Data
@TableName("sys_role")
@ApiModel(value = "SysRole", description = "用户角色")
public class SysRole {

    @ApiModelProperty(value = "角色id")
    @TableId(value = "id",type = IdType.AUTO)
    private Long id; //角色id

    @ApiModelProperty(value = "角色名")
    private String roleName; //角色名

    private Integer state; //是否有效 1有效 2无效 默认1
    private Timestamp createTime; //创建时间
    private Timestamp updateTime; //更新时间

}
