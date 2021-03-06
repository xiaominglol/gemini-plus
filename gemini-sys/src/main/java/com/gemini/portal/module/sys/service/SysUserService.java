package com.gemini.portal.module.sys.service;

import com.gemini.portal.common.service.BaseDetailService;
import com.gemini.portal.module.sys.mapper.SysUserMapper;
import com.gemini.portal.module.sys.mapper.SysUserRoleMapper;
import com.gemini.portal.module.sys.po.SysUserPo;
import com.gemini.portal.module.sys.po.SysUserRolePo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户表
 *
 * @author 小明不读书
 */
public interface SysUserService extends BaseDetailService<SysUserPo, SysUserRolePo, SysUserMapper, SysUserRoleMapper> {

    /**
     * 根据account查询用户
     *
     * @param account
     * @return
     */
    SysUserPo getByAccount(String account);

    /**
     * 根据account查询用户角色
     *
     * @param account
     * @return
     */
    Set<String> getRoleById(String account);

    /**
     * 根据account查询用户权限
     *
     * @param account
     * @return
     */
    Set<String> getPermissionsById(String account);

    /**
     * 通过用户账号查询用户角色
     *
     * @param account
     * @return
     */
    List<Map<String, String>> getUserRole(String account);

    /**
     * 添加用户角色
     *
     * @param account
     * @param ids
     */
    void addUserRole(Long userId, Long[] roleIds);

    /**
     * 删除权用户角色
     *
     * @param account
     */
    void deleteUserRole(String account);
}
