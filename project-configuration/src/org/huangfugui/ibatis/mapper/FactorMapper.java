package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Factor;
import org.springframework.stereotype.Repository;

/**
 * Created by huangfugui on 2017/6/1.
 */
@Repository
public interface FactorMapper {
    Factor selectById(@Param("factorId") int factorId);
}
