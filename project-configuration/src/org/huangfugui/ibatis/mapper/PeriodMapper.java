package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Period;
import org.springframework.stereotype.Repository;

/**
 * Created by huangfugui on 2017/5/31.
 */
@Repository
public interface PeriodMapper {
    Period selectById(@Param("periodId") int periodId);
}
