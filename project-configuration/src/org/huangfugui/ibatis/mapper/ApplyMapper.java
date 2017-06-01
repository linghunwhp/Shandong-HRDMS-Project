package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Apply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huangfugui on 2017/6/1.
 */
@Repository
public interface ApplyMapper {
    List<Apply> selectByUserId(@Param("userId") int userId);
}
