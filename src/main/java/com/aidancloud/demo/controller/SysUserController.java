package com.aidancloud.demo.controller;

import com.aidancloud.core.base.protocol.response.BaseResponse;
import com.aidancloud.core.base.protocol.response.CommonResponse;
import com.aidancloud.core.base.protocol.response.QueryData;
import com.aidancloud.core.base.protocol.response.QueryDataResponse;
import com.aidancloud.demo.proto.sysuser.request.SysUserListRequest;
import com.aidancloud.demo.proto.sysuser.request.SysUserRequest;
import com.aidancloud.demo.proto.sysuser.response.SysUserDTO;
import com.aidancloud.demo.proto.sysuser.response.SysUserListDTO;
import com.aidancloud.demo.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * 后台用户管理
 * @author hutao
 * @date 2019-11-13 17:44
 */
@RestController
@RequestMapping("/sys/user")
@Api(description = "后台用户管理模块")
public class SysUserController {


    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "查询所有后台用户列表信息(带分页)", notes = "查询所有后台用户列表信息(带分页)")
    @GetMapping("/")
    public QueryDataResponse<SysUserListDTO> getUserList(@Valid SysUserListRequest sysUserListRequest) {
        QueryData<SysUserListDTO> sysUserList = sysUserService.getSysUserList(sysUserListRequest);
        return new QueryDataResponse<>(sysUserList);
    }

    @ApiOperation(value = "根据id查询后台用户", notes = "根据id查询后台用户")
    @GetMapping("/{id}")
    public CommonResponse<SysUserDTO> getUser(@Valid @NotBlank @PathVariable("id") Long id) {
        SysUserDTO user = sysUserService.getUser(id);
        return new CommonResponse<>(user);
    }

    @ApiOperation(value = "添加后台用户", notes = "添加后台用户")
    @PostMapping("/")
    public BaseResponse addSysUser(@Valid @RequestBody SysUserRequest sysUserRequest){
        sysUserService.addSysUser(sysUserRequest);
        return new BaseResponse();
    }

    @ApiOperation(value = "根据id更新后台用户", notes = "根据id更新后台用户")
    @PutMapping("/{id}")
    public BaseResponse updateSysUser(@Valid @RequestBody SysUserRequest sysUserRequest,@PathVariable("id") Long id){
        sysUserService.updateSysUser(sysUserRequest,id);
        return new BaseResponse();
    }

    @ApiOperation(value = "根据id更新用户的状态", notes = "根据id更新用户的状态")
    @PutMapping("/{id}/{state}")
    public BaseResponse updateSysUserState(@PathVariable("id") Long id, @PathVariable("state")Integer state){
        sysUserService.updateSysUserState(id,state);
        return new BaseResponse();
    }

    @ApiOperation(value = "根据id删除后台用户", notes = "根据id删除后台用户")
    @DeleteMapping("/{id}")
    public BaseResponse deleteSysUserById(@Valid @NotBlank @PathVariable("id") Long id){
        sysUserService.deleteSysUser(id);
        return new BaseResponse();
    }



}
