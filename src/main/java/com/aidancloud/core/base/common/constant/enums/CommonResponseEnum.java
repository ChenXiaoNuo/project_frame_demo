package com.aidancloud.core.base.common.constant.enums;

import com.aidancloud.core.base.common.exception.BaseException;
import com.aidancloud.core.base.common.exception.assertion.CommonExceptionAssert;
import com.aidancloud.core.base.protocol.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hutao
 * @date 2019-11-06 17:07
 */
@Getter
@AllArgsConstructor
public enum CommonResponseEnum implements CommonExceptionAssert {

    /**
     * 成功
     */
    SUCCESS(200, "SUCCESS"),

    /**
     * 服务器繁忙
     */
    SERVER_BUSY(9998, "服务器繁忙"),

    /**
     * 服务器异常
     */
    SERVER_ERROR(9999, "服务器异常"),
    ;


    private int code;

    private String message;

    public static void assertSuccess(BaseResponse response) {
        SERVER_ERROR.assertNotNull(response);
        int code = response.getCode();
        if(CommonResponseEnum.SUCCESS.getCode() != code){
            String msg = response.getMessage();
            throw new BaseException(code, msg);
        }
    }


}
