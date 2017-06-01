package org.huangfugui.ibatis.po;

/**
 * @author zqb
 * @decription …Û≈˙…Í±®±Ì
 * @create 2017/5/28
 */
public class Approval {
    int approvalId;
    int applyId;
    int userId;
    int approvalStatus;
    String approvalDescribe;

    public int getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(int approvalId) {
        this.approvalId = approvalId;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(int approvalStatus) {
        this.approvalStatus = approvalStatus;
    }



    public String getApprovalDescribe() {
        return approvalDescribe;
    }

    public void setApprovalDescribe(String approvalDescribe) {
        this.approvalDescribe = approvalDescribe;
    }

    @Override
    public String toString() {
        return "Approval{" +
                "approvalId=" + approvalId +
                ", applyId=" + applyId +
                ", userId=" + userId +
                ", approvalStatus=" + approvalStatus +
                ", approvalDescribe='" + approvalDescribe + '\'' +
                '}';
    }
}
