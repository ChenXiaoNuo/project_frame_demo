package com.aidancloud.core.base.protocol.response;

/**
 * @author hutao
 * @date 2019-11-06 17:41
 */
public class ErrorResponse extends BaseResponse {

    public ErrorResponse() {
    }

    public ErrorResponse(int code, String message) {
        super(code, message);
    }
}
