package com.aidancloud.demo.mapper;

import com.aidancloud.demo.entity.SysUser;
import com.aidancloud.demo.proto.sysuser.response.SysUserListDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;


/**
 * @author hutao
 * @date 2019-11-07 14:18
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    IPage<SysUserListDTO> getUserList(Page page, @Param("username") String username);

}
