package com.aidancloud.demo.proto.sysuser.enums;

import com.aidancloud.core.base.common.exception.assertion.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hutao
 * @date 2019-11-07 14:32
 */
@Getter
@AllArgsConstructor
public enum SysUserResponseEnum implements BusinessExceptionAssert {

    USER_NOT_FOUND(10001,"用户不存在"),

    USER_ALREADY_EXISTS(10002,"用户已存在"),

    USER_STATE_ERROR(10003,"用户状态标识不正确")

    ;

    private int code;

    private String message;

}
