package com.aidancloud.demo.proto.sysuser.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hutao
 * @date 2019-11-07 14:58
 */
@Data
@ApiModel(value = "SysUserListDTO", description = "用户个人信息列表")
public class SysUserListDTO {

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
}
