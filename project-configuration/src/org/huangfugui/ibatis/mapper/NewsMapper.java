package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Cooper on 2017/5/23 0023.
 */
@Repository
public interface NewsMapper {

    List<Notice> selectAll();

    int  ReleaseNews(@Param("userid") int userid, @Param("title") String title, @Param("content") String content,@Param("Release_time") String Release_time);

}
