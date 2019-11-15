package com.aidancloud.core.base.common.exception.assertion;

import com.aidancloud.core.base.common.constant.IResponseEnum;
import com.aidancloud.core.base.common.exception.ArgumentException;
import com.aidancloud.core.base.common.exception.BaseException;

import java.text.MessageFormat;

/**
 * @author hutao
 * @date 2019-11-06 17:05
 */
public interface CommonExceptionAssert extends IResponseEnum, Assert {
    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new ArgumentException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable cause, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new ArgumentException(this, args, msg, cause);
    }
}
