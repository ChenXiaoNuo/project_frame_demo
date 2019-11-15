package com.aidancloud.demo.proto.sysuser.enums;

import com.aidancloud.core.base.common.constant.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author hutao
 * @date 2019-11-07 14:41
 */
@Getter
@ToString
@AllArgsConstructor
public enum SysUserStateEnum implements Dictionary {

    ABNORMAL(0, "锁定"),
    NORMAL(1,"正常")

    ;
    private Integer code;
    private String name;

    /**
     * 根据用户状态标识返回枚举
     * @param code
     * @return
     */
    public static SysUserStateEnum parseOfNullable(Integer code){
        if (code != null) {
            for (SysUserStateEnum value : values()) {
                if (value.code == code){
                    return value;
                }
            }
        }
        return null;
    }

    public static String parseOfNameNullable(Integer code){
        SysUserStateEnum userGenderEnum = parseOfNullable(code);
        return userGenderEnum == null ? null : userGenderEnum.getName();
    }

}
