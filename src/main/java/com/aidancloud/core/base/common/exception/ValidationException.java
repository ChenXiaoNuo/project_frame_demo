package com.aidancloud.core.base.common.exception;

import com.aidancloud.core.base.common.constant.IResponseEnum;

/**
 * 校验异常
 * 调用接口时，参数格式不合法可以抛出该异常
 * @author hutao
 * @date 2019-11-06 16:58
 */
public class ValidationException extends BaseException{

    public ValidationException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public ValidationException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
