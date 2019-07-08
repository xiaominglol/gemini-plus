package com.gemini.boot.framework.admin.module.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.boot.framework.admin.module.sys.model.OptLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 操作日志-Dao
 *
 * @author 小明不读书
 * @date 2018-10-18
 */
@Mapper
public interface OptLogMapper extends BaseMapper<OptLog> {

}