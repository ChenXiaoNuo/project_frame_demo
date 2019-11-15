package com.aidancloud.core.base.common.constant;

/**
 * 异常返回码枚举接口
 * @author hutao
 * @date 2019-11-06 13:45
 */
public interface IResponseEnum {

    /**
     * 获取返回码
     * @return
     */
    int getCode();


    /**
     * 获取返回消息
     * @return
     */
    String getMessage();

}
