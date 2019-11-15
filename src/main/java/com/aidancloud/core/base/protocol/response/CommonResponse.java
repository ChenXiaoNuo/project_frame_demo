package com.aidancloud.core.base.protocol.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hutao
 * @date 2019-11-06 17:24
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonResponse<T> extends BaseResponse {

    private T data;

    public CommonResponse() {
        super();
    }

    public CommonResponse(T data) {
        super();
        this.data = data;
    }
}
