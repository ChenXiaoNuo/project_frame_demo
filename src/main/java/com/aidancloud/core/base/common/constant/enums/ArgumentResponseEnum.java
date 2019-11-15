package com.aidancloud.core.base.common.constant.enums;

import com.aidancloud.core.base.common.exception.assertion.CommonExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hutao
 * @date 2019-11-06 17:27
 */
@Getter
@AllArgsConstructor
public enum ArgumentResponseEnum implements CommonExceptionAssert {

    VALID_ERROR(6000, "参数校验异常")


    ;

    private int code;

    private String message;



}
