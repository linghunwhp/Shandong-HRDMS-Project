package org.huangfugui.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.huangfugui.ibatis.po.Approval;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zqb
 * @decription 报表管理
 * @create 2017/5/28
 */
@Repository
public interface ApprovalMapper {
    /**
     * @name addApproval
     * @description 新增审批条目,每当有一个审批时就产生一个条目
     * @param applyId
     * @param userId
     * @param approvalStatus
     * @param approvalDescribe
     * @return 受影响的数目
     */
    int addApproval(@Param("applyId") int applyId,
                    @Param("userId") int userId,
                    @Param("approvalStatus") int approvalStatus,
                    @Param("approvalDescribe") String approvalDescribe);


    /**
     * @name selectById
     * @description 通过id查询，一般为点击某一条审批记录查看详情
     * @param approvalId
     * @return 符合条件的结果
     */
    List<Approval> selectById(@Param("approvalId") int approvalId);



    /**
     * @name selectByStatus
     * @description 通过审批状态查询
     * @param approvalStatus
     * @return
     */
    List<Approval> selectByStatus(@Param("approvalStatus")int approvalStatus);

    /**
     * 查看当前周期内该用户的所有审批
     * @name
     * @description
     * @param  userId
     * @return
     */
    List<Approval> selectByUser(@Param("userId")int userId);


    /**
     * 查看该申请经过的所有审批流程
     * @name
     * @description
     * @param  applyId
     * @return
     */
    List<Approval> selectByApplyId(@Param("applyId")int applyId);


    /**
     * 删除某一审批
     * @name
     * @description
     * @param  approvalId
     * @return
     */
    int deleteByApprovalId(@Param("approvalId")int approvalId);


    /**
    * @name deleteByApplyId
    * @description 删除某一申请的审批记录
    * @param  applyId
    * @return
    */
    int deleteByApplyId(@Param("applyId")int applyId);
}
