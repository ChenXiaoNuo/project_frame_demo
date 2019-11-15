package com.aidancloud.demo.proto.sysuser.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author hutao
 * @date 2019-11-07 14:58
 */
@Data
@ApiModel(value = "SysUserDTO", description = "用户个人详情")
public class SysUserDTO {

    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "昵称")
    private String nickname;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "联系方式")
    private String mobile;
    @ApiModelProperty(value = "用户状态 0锁定 1正常")
    private Integer state;
    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间")
    private Timestamp updateTime;
    @ApiModelProperty(value = "用户拥有的角色列表")
    private List<Long> roles;
}
