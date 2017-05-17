package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.enums.UserType;
import org.huangfugui.ibatis.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 用户注册
     * @param username
     * @param password
     * @param userType
     * @return
     */
    int insertUser(@Param("username") String username, @Param("password") String password, @Param("userType") UserType userType);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
