package org.huangfugui.spring.mvc.controller;

import org.huangfugui.dto.Result;
import org.huangfugui.ibatis.po.User;
import org.huangfugui.spring.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Cooper on 2017/5/23 0023.
 */
@Controller
@RequestMapping("/basic")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/selectAll",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result selectAllHandler(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        String username = ((User) session.getAttribute("userSession")).getUsername();
        return newsService.selectAll(request);
    }

    @RequestMapping(value = "/ReleaseNews",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result ReleaseNews(HttpServletRequest request, Model model){

        HttpSession session = request.getSession();
        int userid = ((User) session.getAttribute("userSession")).getUserId();
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String Release_time = df.format(new Date());
        return newsService.ReleaseNews(userid,title,content,Release_time,request);
    }
}
