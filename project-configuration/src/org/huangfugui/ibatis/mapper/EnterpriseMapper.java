package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Enterprise;
import org.springframework.stereotype.Repository;

/**
 * Created by huangfugui on 2017/5/30.
 */
@Repository
public interface EnterpriseMapper {

    Enterprise selectEnterpriseByUserId(@Param("userId") int userId);

    int insertEnterprise(Enterprise enterprise);

    int updateEnterprise(Enterprise enterprise);
}