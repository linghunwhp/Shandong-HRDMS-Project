import org.huangfugui.ibatis.mapper.ApprovalMapper;
import org.huangfugui.spring.MyConfig;
import org.huangfugui.spring.service.ApprovalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by zqb on 2017/5/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class ApprovalServiceTest {
    @Autowired
    private ApprovalMapper approvalMapper;

    @Autowired
    private ApprovalService approvalService;

    @Test
    public void addApproval() throws Exception {
        System.out.println(approvalService.addApproval(1,2,1,"确认通过1"));
    }

    @Test
    public void approvalDetail() throws Exception {

        System.out.println(approvalService.approvalDetail(1).toString());
    }

    @Test
    public void selectByUserIdNo() throws Exception {
        System.out.println(approvalService.selectByUserIdNo(3).toString());
    }

    @Test
    public void selectByUserId() throws Exception {
        System.out.println(approvalService.selectByUserId(3));
    }

    @Test
    public void deleteApprovalById() throws Exception {
        System.out.println(approvalService.deleteApprovalById(4));
    }

    @Test
    public void getFlowByApplyId() throws Exception {
        System.out.println(approvalService.getFlowByApplyId(1));
    }

}