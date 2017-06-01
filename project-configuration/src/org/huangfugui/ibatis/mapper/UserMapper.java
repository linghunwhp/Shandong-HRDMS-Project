package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    User selectByUserId(@Param("userId") int userId);


    List<User> getCityEnterprise(@Param("cityId")int cityId);

}
