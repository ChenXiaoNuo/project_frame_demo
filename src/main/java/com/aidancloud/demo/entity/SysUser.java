package com.aidancloud.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.sql.Timestamp;

/**
 * 后台用户表
 * @author hutao
 * @date 2019-11-13 16:54
 */
@ApiModel(value = "SysUser", description = "后台用户个人信息")
@Data
@TableName("sys_user")
public class SysUser {

    @ApiModelProperty(value = "用户id")
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户密码")
    private String password;
    @ApiModelProperty(value = "用户昵称")
    private String nickname;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "联系方式")
    private String mobile;
    @ApiModelProperty(value = "用户状态 0锁定 1正常")
    private Integer state;//用户状态 0锁定 1正常 默认1
    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间")
    private Timestamp updateTime;

}
