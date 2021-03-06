package com.gemini.portal.module.sys.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseSubPo;
import lombok.Data;

/**
 * 菜单表
 *
 * @author 小明不读书
 */
@Data
@TableName("f_sys_menu")
public class SysMenuPo extends BaseSubPo<SysMenuPo> {

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 菜单icon
     */
    private String icon;

    /**
     * 菜单类型id
     */
    private Long menuTypeId;

    /**
     * 菜单类型编码
     */
    private String menuTypeCode;

    /**
     * 菜单类型名称
     */
    private String menuTypeName;

    /**
     * 打开方式id
     */
    private Long targetId;

    /**
     * 打开方式编码
     */
    private String targetCode;

    /**
     * 打开方式名称
     */
    private String targetName;

    /**
     * 权限id
     */
    private Long permissionId;

    /**
     * 权限编码
     */
    private String permissionCode;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 排序
     */
    private String sort;

}
