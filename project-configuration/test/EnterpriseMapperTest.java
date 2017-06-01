import org.huangfugui.ibatis.mapper.EnterpriseMapper;
import org.huangfugui.ibatis.po.Enterprise;
import org.huangfugui.ibatis.po.User;
import org.huangfugui.spring.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangfugui on 2017/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class EnterpriseMapperTest {

    @Autowired
    private EnterpriseMapper enterpriseMapper;
    @Test
    public void selectEnterpriseByUserId() throws Exception {
        Enterprise enterprise = enterpriseMapper.selectEnterpriseByUserId(1);
        System.out.println(enterprise);
    }

    @Test
    public void insertEnterprise() throws Exception {

        User user = new User();
        user.setUserId(1);

        Enterprise enterprise = new Enterprise();
        enterprise.setUser(user);
        enterprise.setEnterpriseAddress("北京海淀区中关村");
        enterprise.setEnterpriseCode("100081");
        enterprise.setEnterpriseName("北京理工大学");
        //enterprise.setEnterpriseIndustry(1);
        //enterprise.setEnterpriseProperty(1);
        enterprise.setEnterpriseBusiness("教学科研");
        enterprise.setEnterpriseContactor("黄复贵");
        enterprise.setContactorAddress("3# 107");
        enterprise.setEnterprisePostCode("100081");
        enterprise.setEnterprisePhone("13051189772");
        enterprise.setEnterpriseFax("122211111");
        enterprise.setEnterpriseEmail("1151650717@qq.com");

        int result = enterpriseMapper.insertEnterprise(enterprise);
        System.out.println(result);
    }

    @Test
    public void updateEnterprise() throws Exception {

        User user = new User();
        user.setUserId(1);

        Enterprise enterprise = new Enterprise();
        enterprise.setUser(user);
        enterprise.setEnterpriseAddress("广东深圳");
        enterprise.setEnterpriseCode("100081");
        enterprise.setEnterpriseName("会展中心");

        int result = enterpriseMapper.updateEnterprise(enterprise);
        System.out.println(result);
    }
}