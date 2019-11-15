package com.aidancloud.core.base.common.exception.assertion;

import com.aidancloud.core.base.common.constant.IResponseEnum;
import com.aidancloud.core.base.common.exception.BaseException;
import com.aidancloud.core.base.common.exception.BusinessException;

import java.text.MessageFormat;

/**
 * 业务断言异常
 * @author hutao
 * @date 2019-11-06 17:02
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable cause, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg, cause);
    }
}
