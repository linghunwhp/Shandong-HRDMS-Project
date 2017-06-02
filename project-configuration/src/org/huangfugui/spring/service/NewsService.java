package org.huangfugui.spring.service;

import org.huangfugui.dto.Result;
import org.huangfugui.ibatis.enums.UserType;
import org.huangfugui.ibatis.mapper.NewsMapper;
import org.huangfugui.ibatis.po.Notice;
import org.huangfugui.ibatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Cooper on 2017/5/23 0023.
 */
@Component
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;
    public Result selectAll(HttpServletRequest request){
        Notice news = new Notice();
        List<Notice> list = newsMapper.selectAll();
        HttpSession session = request.getSession();
        if(session!=null)
        {
            return new Result(1,"查询成功",list);
        }
        return new Result(0,"查询失败");
    }

    public Result ReleaseNews(int userid ,String title,String content,String Release_time,HttpServletRequest request){

        HttpSession session = request.getSession();

        int sessionuserid = ((User) session.getAttribute("userSession")).getUserId();
        UserType sessionusertype = ((User) session.getAttribute("userSession")).getUserType();

        if(sessionusertype.equals("0")){
            return new Result(0,"您没有权限");
        }
        int result = newsMapper.ReleaseNews(sessionuserid,title,content,Release_time);
        if(result==1){
            return new Result(1,"发布成功");
        }
        return new Result(0,"发布失败");
    }
}
