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
    approvalStatus����״̬��
            1��ͨ��
            0������
     */
    public Result addApproval(int applyId, int userId, int approvalStatus, String approvalDescribe)
    {
        int user_type=userMapper.selectByUserId(userId).getUserType().getId();
        if(user_type==0)//��ҵ�û�
        {
            return new Result(300,"��Ȩ��");
        }
        int res= approvalMapper.addApproval(applyId,userId,approvalStatus,approvalDescribe);
        if (res>0)
        {
            return new Result(200,"�ɹ�");
        }
        return new Result(300,"ʧ��");
    }

    public Result approvalDetail(int approvalId)
    {
        List<Approval> approval_list=approvalMapper.selectById(approvalId);
        return new Result(200,"",approval_list);
    }


    /*
    1����ͨ����ʡδ��ˣ�
    2���в���
    3��ʡͨ��
    4��ʡ����
     */


    //��ѯ���û����ܹ����δ����걨
    public Result selectByUserIdNo(int userId)
    {
        User cur_user=userMapper.selectByUserId(userId);
        int user_type=cur_user.getUserType().getId();
        if(user_type==0)//��ҵ�û�
        {
            return new Result(0,"��Ȩ��");
        }
        else if(user_type==1)//���û�
        {
            //��ȡ����������ҵ��Ȼ����걨���в�ѯ
            List<User> enterprises= userMapper.getCityEnterprise(cur_user.getUserCity());
            List<Enterprise> list=new ArrayList<>();
            for(int i=0;i<enterprises.size();i++)
            {
                System.out.println(enterprises.get(i).toString());
                //��ѯ�걨��
                //list.add();

            }
            return new Result(200,"",list);
        }
        else //ʡ�û�
        {
            //��ȡ������ͨ���ļ��ɣ�״̬Ϊ1
            List<Approval> list=approvalMapper.selectByStatus(1);
            return new Result(200,"",list);
        }
    }

    //��ѯ���û���������걨(�Լ�������)
    public Result selectByUserId(int userId)
    {
        User cur_user=userMapper.selectByUserId(userId);
        int user_type=cur_user.getUserType().getId();
        if(user_type==0)//��ҵ�û�
        {
            return new Result(0,"��Ȩ��");
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
        return new Result(200,"ɾ���ɹ�");
    }

    //��ȡĳһ��������о�������
    public Result getFlowByApplyId(int applyId)
    {
        return new Result(200,"�ɹ�",approvalMapper.selectByApplyId(applyId));
    }

    //ɾ��ĳһ���������������¼
    public Result deleteApplyRecord(int applyId)
    {
        approvalMapper.deleteByApplyId(applyId);
        return new Result(200,"ɾ���ɹ�");
    }
}
