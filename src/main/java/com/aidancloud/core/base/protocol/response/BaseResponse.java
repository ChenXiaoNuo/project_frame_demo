package com.aidancloud.core.base.protocol.response;

import com.aidancloud.core.base.common.constant.IResponseEnum;
import com.aidancloud.core.base.common.constant.enums.CommonResponseEnum;
import lombok.Data;

/**
 * 基础返回结果
 * @author hutao
 * @date 2019-11-06 17:12
 */
@Data
public class BaseResponse {

    /**
     * 返回码
     */
    protected int code;

    /**
     * 返回消息
     */
    protected String message;

    public BaseResponse() {
        //默认创建成功的响应
        this(CommonResponseEnum.SUCCESS);
    }

    public BaseResponse(IResponseEnum responseEnum) {
        this(responseEnum.getCode(), responseEnum.getMessage());
    }

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
