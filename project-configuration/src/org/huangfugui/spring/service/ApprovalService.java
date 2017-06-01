package org.huangfugui.spring.service;

import org.huangfugui.dto.Result;
import org.huangfugui.ibatis.mapper.ApprovalMapper;
import org.huangfugui.ibatis.mapper.EnterpriseMapper;
import org.huangfugui.ibatis.mapper.UserMapper;
import org.huangfugui.ibatis.po.Approval;
import org.huangfugui.ibatis.po.Enterprise;
import org.huangfugui.ibatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zqb
 * @decription
 * @create 2017/5/28
 */
@Service
public class ApprovalService {

    @Autowired
    private ApprovalMapper approvalMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;
    /*
    approvalStatus传入状态：
            1：通过
            0：驳回
     */
    public Result addApproval(int applyId, int userId, int approvalStatus, String approvalDescribe)
    {
        int user_type=userMapper.selectByUserId(userId).getUserType().getId();
        if(user_type==0)//企业用户
        {
            return new Result(300,"无权限");
        }
        int res= approvalMapper.addApproval(applyId,userId,approvalStatus,approvalDescribe);
        if (res>0)
        {
            return new Result(200,"成功");
        }
        return new Result(300,"失败");
    }

    public Result approvalDetail(int approvalId)
    {
        List<Approval> approval_list=approvalMapper.selectById(approvalId);
        return new Result(200,"",approval_list);
    }


    /*
    1、市通过（省未审核）
    2、市驳回
    3、省通过
    4、省驳回
     */


    //查询该用户所能管理的未审核申报
    public Result selectByUserIdNo(int userId)
    {
        User cur_user=userMapper.selectByUserId(userId);
        int user_type=cur_user.getUserType().getId();
        if(user_type==0)//企业用户
        {
            return new Result(0,"无权限");
        }
        else if(user_type==1)//市用户
        {
            //获取市下所有企业，然后从申报表中查询
            List<User> enterprises= userMapper.getCityEnterprise(cur_user.getUserCity());
            List<Enterprise> list=new ArrayList<>();
            for(int i=0;i<enterprises.size();i++)
            {
                System.out.println(enterprises.get(i).toString());
                //查询申报表
                //list.add();

            }
            return new Result(200,"",list);
        }
        else //省用户
        {
            //获取所有市通过的即可，状态为1
            List<Approval> list=approvalMapper.selectByStatus(1);
            return new Result(200,"",list);
        }
    }

    //查询该用户的已审核申报(自己审批的)
    public Result selectByUserId(int userId)
    {
        User cur_user=userMapper.selectByUserId(userId);
        int user_type=cur_user.getUserType().getId();
        if(user_type==0)//企业用户
        {
            return new Result(0,"无权限");
        }
        else
        {
            List<Approval> list=approvalMapper.selectByUser(userId);
            return new Result(200,"",list);
        }
    }

    public Result deleteApprovalById(int approvalId)
    {
        approvalMapper.deleteByApprovalId(approvalId);
        return new Result(200,"删除成功");
    }

    //获取某一申请的所有经过流程
    public Result getFlowByApplyId(int applyId)
    {
        return new Result(200,"成功",approvalMapper.selectByApplyId(applyId));
    }

    //删除某一申请的所有审批记录
    public Result deleteApplyRecord(int applyId)
    {
        approvalMapper.deleteByApplyId(applyId);
        return new Result(200,"删除成功");
    }
}
