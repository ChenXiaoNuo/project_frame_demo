package com.aidancloud.demo.proto.sysuser.request;

import com.aidancloud.core.base.protocol.param.QueryParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Range;

/**
 * @author hutao
 * @date 2019-11-07 14:38
 */
@ApiModel(value = "SysUserListRequest", description = "获取用户列表的请求数据")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserListRequest extends QueryParam {

    @ApiModelProperty(value = "用户名")
    private String username;

}
