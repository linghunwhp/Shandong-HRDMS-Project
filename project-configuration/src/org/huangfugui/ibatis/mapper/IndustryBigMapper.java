package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.IndustryBig;
import org.springframework.stereotype.Repository;

/**
 * Created by huangfugui on 2017/5/31.
 */
@Repository
public interface IndustryBigMapper {
    IndustryBig selectByBigId(@Param("bigId") int bigId);
}
