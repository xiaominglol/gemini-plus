package com.gemini.portal.module.sys.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BootCrudServiceImpl;
import com.gemini.portal.module.sys.mapper.SysUserMapper;
import com.gemini.portal.module.sys.po.SysUserPo;
import com.gemini.portal.module.sys.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户表
 * @author wenge.cai
 */
@Service
public class SysUserServiceImpl extends BootCrudServiceImpl<SysUserPo, SysUserMapper> implements SysUserService {

    @Override
    public QueryWrapper<SysUserPo> wrapper(SysUserPo po) {
        return super.wrapper(po)
                .eq(!StringUtils.isEmpty(po.getAccount()), "account", po.getAccount())
                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                .eq(!StringUtils.isEmpty(po.getPassword()), "password", po.getPassword())
                .eq(!StringUtils.isEmpty(po.getPicture()), "picture", po.getPicture())
                .eq(!StringUtils.isEmpty(po.getOrgId()), "org_id", po.getOrgId())
                .eq(!StringUtils.isEmpty(po.getOrgName()), "org_name", po.getOrgName())
//                .eq(!StringUtils.isEmpty(po.getCreateDatetime()), "create_datetime", po.getCreateDatetime())
                .eq(!StringUtils.isEmpty(po.getStateId()), "state_id", po.getStateId())
                .eq(!StringUtils.isEmpty(po.getStateCode()), "state_code", po.getStateCode())
                .eq(!StringUtils.isEmpty(po.getStateName()), "state_name", po.getStateName())
                .eq(!StringUtils.isEmpty(po.getModifyId()), "modify_id", po.getModifyId())
                .eq(!StringUtils.isEmpty(po.getModifyName()), "modify_name", po.getModifyName())
                .eq(!StringUtils.isEmpty(po.getModifyTime()), "modify_time", po.getModifyTime());
    }

    @Override
    public SysUserPo getByAccount(String account) {
        QueryWrapper<SysUserPo> qw = new QueryWrapper<>();
        qw.eq("account", account);
        return mapper.selectOne(qw);
    }

    @Override
    public Set<String> getRoleById(String account) {
        return mapper.getRoleById(account);
    }

    @Override
    public Set<String> getPermissionsById(String account) {
        return mapper.getPermissionsById(account);
    }

    @Override
    public List<Map<String, String>> getUserRole(String account) {
        return mapper.getUserRole(account);
    }

    @Override
    public void addUserRole(String account, String[] ids) {
        mapper.addUserRole(account, ids);
    }

    @Override
    public void deleteUserRole(String account) {
        mapper.deleteUserRole(account);
    }
}
