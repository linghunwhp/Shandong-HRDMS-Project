package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Approval;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zqb
 * @decription �������
 * @create 2017/5/28
 */
@Repository
public interface ApprovalMapper {
    /**
     * @name addApproval
     * @description ����������Ŀ,ÿ����һ������ʱ�Ͳ���һ����Ŀ
     * @param applyId
     * @param userId
     * @param approvalStatus
     * @param approvalDescribe
     * @return ��Ӱ�����Ŀ
     */
    int addApproval(@Param("applyId") int applyId,
                    @Param("userId") int userId,
                    @Param("approvalStatus") int approvalStatus,
                    @Param("approvalDescribe") String approvalDescribe);


    /**
     * @name selectById
     * @description ͨ��id��ѯ��һ��Ϊ���ĳһ��������¼�鿴����
     * @param approvalId
     * @return ���������Ľ��
     */
    List<Approval> selectById(@Param("approvalId") int approvalId);



    /**
     * @name selectByStatus
     * @description ͨ������״̬��ѯ
     * @param approvalStatus
     * @return
     */
    List<Approval> selectByStatus(@Param("approvalStatus")int approvalStatus);

    /**
     * �鿴��ǰ�����ڸ��û�����������
     * @name
     * @description
     * @param  userId
     * @return
     */
    List<Approval> selectByUser(@Param("userId")int userId);


    /**
     * �鿴�����뾭����������������
     * @name
     * @description
     * @param  applyId
     * @return
     */
    List<Approval> selectByApplyId(@Param("applyId")int applyId);


    /**
     * ɾ��ĳһ����
     * @name
     * @description
     * @param  approvalId
     * @return
     */
    int deleteByApprovalId(@Param("approvalId")int approvalId);


    /**
    * @name deleteByApplyId
    * @description ɾ��ĳһ�����������¼
    * @param  applyId
    * @return
    */
    int deleteByApplyId(@Param("applyId")int applyId);
}
