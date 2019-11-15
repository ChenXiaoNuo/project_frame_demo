package com.aidancloud.demo.service.impl;

import com.aidancloud.core.base.protocol.param.QueryPage;
import com.aidancloud.core.base.protocol.response.QueryData;
import com.aidancloud.demo.entity.SysUser;
import com.aidancloud.demo.mapper.SysUserMapper;
import com.aidancloud.demo.mapper.SysUserRoleMapper;
import com.aidancloud.demo.proto.sysuser.enums.SysUserResponseEnum;
import com.aidancloud.demo.proto.sysuser.enums.SysUserStateEnum;
import com.aidancloud.demo.proto.sysuser.request.SysUserListRequest;
import com.aidancloud.demo.proto.sysuser.request.SysUserRequest;
import com.aidancloud.demo.proto.sysuser.response.SysUserDTO;
import com.aidancloud.demo.proto.sysuser.response.SysUserListDTO;
import com.aidancloud.demo.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hutao
 * @date 2019-11-13 17:11
 */
@Service
@Slf4j
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService  {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public QueryData<SysUserListDTO> getSysUserList(SysUserListRequest sysUserListRequest) {
        Page<SysUserListDTO> page = new QueryPage<>(sysUserListRequest);
        IPage<SysUserListDTO> userList = sysUserMapper.getUserList(page,sysUserListRequest.getUsername());
        QueryData<SysUserListDTO> queryData = new QueryData<>(userList);
        return queryData;
    }

    @Override
    public SysUserDTO getUser(Long id) {
        SysUser sysUser = this.getById(id);
        SysUserDTO sysUserDTO = ToSysUserDTO(sysUser);
        List<Long> roleList = sysUserRoleMapper.getRoleListByUserId(id);
        sysUserDTO.setRoles(roleList);
        return sysUserDTO;
    }

    @Transactional
    @Override
    public void addSysUser(SysUserRequest sysUserRequest) {
        checkUserIsExisted(sysUserRequest.getUsername());
        //不存在后直接插入新用户
        SysUser sysUser = requestToEntity(sysUserRequest);
        this.save(sysUser);
    }

    @Transactional
    @Override
    public void updateSysUser(SysUserRequest sysUserRequest, Long id) {
        //查询修改后的用户名是否与其他用户冲突

        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(SysUser::getUsername, sysUserRequest.getUsername());
        queryWrapper.ne(SysUser::getId, id);
        int count = this.count(queryWrapper);
        //如果查询出来的列表数量大于0，说明冲突
        SysUserResponseEnum.USER_ALREADY_EXISTS.assertIsFalse(count > 0);
        SysUser sysUser = requestToEntity(sysUserRequest);
        sysUser.setId(id);
        this.updateById(sysUser);
    }

    @Transactional
    @Override
    public void updateSysUserState(Long id, Integer state) {
        //判断传入的用户标识是否正确，错误抛出异常
        SysUserStateEnum sysUserStateEnum = SysUserStateEnum.parseOfNullable(state);
        SysUserResponseEnum.USER_STATE_ERROR.assertNotNull(sysUserStateEnum);
        SysUser sysUser = new SysUser();
        sysUser.setId(id);
        sysUser.setState(state);
        this.updateById(sysUser);
    }

    @Transactional
    @Override
    public void deleteSysUser(Long id) {
        this.removeById(id);
    }

    /**
     * 检查数据库中用户是否已存在，存在则抛出异常
     * @param username
     */
    private void checkUserIsExisted(String username){
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getUsername, username);
        SysUserResponseEnum.USER_ALREADY_EXISTS.assertIsNull(this.getOne(queryWrapper));
    }

    /**
     * entity -> dto
     * @param sysUser
     * @return
     */
    private SysUserDTO ToSysUserDTO(SysUser sysUser){
        SysUserDTO sysUserDTO = new SysUserDTO();
        sysUserDTO.setId(sysUser.getId());
        sysUserDTO.setUsername(sysUser.getUsername());
        sysUserDTO.setNickname(sysUser.getNickname());
        sysUserDTO.setEmail(sysUser.getEmail());
        sysUserDTO.setMobile(sysUser.getMobile());
        sysUserDTO.setState(sysUser.getState());
        sysUserDTO.setCreateTime(sysUser.getCreateTime());
        sysUserDTO.setUpdateTime(sysUser.getUpdateTime());
        return sysUserDTO;
    }

    /**
     * 将请求数据转换为entity
     * @param sysUserRequest
     * @return
     */
    private SysUser requestToEntity(SysUserRequest sysUserRequest){
        SysUser sysUser = new SysUser();
        sysUser.setUsername(sysUserRequest.getUsername());
        sysUser.setPassword(sysUserRequest.getPassword());
        sysUser.setNickname(sysUserRequest.getNickname());
        sysUser.setEmail(sysUserRequest.getEmail());
        sysUser.setMobile(sysUserRequest.getMobile());
        return sysUser;
    }

}
