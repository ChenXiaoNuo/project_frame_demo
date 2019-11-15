package com.aidancloud.core.base.common.exception;

import com.aidancloud.core.base.common.constant.IResponseEnum;

/**
 * 业务异常
 * 业务处理时，出现异常，可以抛出该异常
 * @author hutao
 * @date 2019-11-06 16:53
 */
public class BusinessException extends BaseException {

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
