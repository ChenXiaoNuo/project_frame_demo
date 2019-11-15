package com.aidancloud.demo.service;

import com.aidancloud.core.base.protocol.response.QueryData;
import com.aidancloud.demo.proto.sysuser.request.SysUserListRequest;
import com.aidancloud.demo.proto.sysuser.request.SysUserRequest;
import com.aidancloud.demo.proto.sysuser.response.SysUserDTO;
import com.aidancloud.demo.proto.sysuser.response.SysUserListDTO;




/**
 * @author hutao
 * @date 2019-11-13 17:10
 */
public interface SysUserService {


    QueryData<SysUserListDTO> getSysUserList(SysUserListRequest sysUserListRequest);

    SysUserDTO getUser(Long id);

    void addSysUser(SysUserRequest sysUserRequest);

    void updateSysUser(SysUserRequest sysUserRequest,Long id);

    /**
     * 更新用户状态
     * @param id 用户id
     * @param state 用户状态 0锁定 1正常
     */
    void updateSysUserState(Long id,Integer state);

    void deleteSysUser(Long id);

}
