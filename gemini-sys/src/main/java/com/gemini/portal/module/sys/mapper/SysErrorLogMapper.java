package com.gemini.portal.module.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.portal.module.sys.po.SysErrorLogPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 错误日志表
 *
 * @author 小明不读书
 */
@Mapper
public interface SysErrorLogMapper extends BaseMapper<SysErrorLogPo> {
}
