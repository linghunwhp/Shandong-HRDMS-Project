package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.IndustrySmall;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huangfugui on 2017/5/31.
 */
@Repository
public interface IndustrySmallMapper {
    IndustrySmall selectBySmallId(@Param("smallId") int smallId);
}