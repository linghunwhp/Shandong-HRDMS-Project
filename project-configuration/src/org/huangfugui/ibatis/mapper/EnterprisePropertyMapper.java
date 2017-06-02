package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.EnterpriseProperty;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterprisePropertyMapper {
    EnterpriseProperty selectByPropertyId(@Param("propertyId") int propertyId);
}