package com.aidancloud.core.base.common.constant;

/**
 * 字典接口
 * @author hutao
 * @date 2019-11-06 13:46
 */
public interface Dictionary {

    /**
     * 字典标识代码
     * @return
     */
    Integer getCode();

    /**
     * 字典表示代码对应含义
     * @return
     */
    String getName();

    default boolean equalsCode(Integer code) {
        return getCode().equals(code);
    }


}
