package com.aidancloud.demo.proto.sysuser.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author hutao
 * @date 2019-11-13 18:22
 */
@ApiModel(value = "SysUserRequest", description = "编辑或添加后台用户的通用请求数据")
@Data
public class SysUserRequest {

    @ApiModelProperty(value = "用户名")
    @NotBlank
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户昵称")
    @NotBlank
    private String nickname;

    @ApiModelProperty(value = "邮箱")
    @Email
    private String email;

    @ApiModelProperty(value = "联系方式")
    private String mobile;
}
