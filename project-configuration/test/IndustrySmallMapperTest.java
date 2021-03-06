import org.huangfugui.ibatis.mapper.IndustrySmallMapper;
import org.huangfugui.ibatis.po.IndustrySmall;
import org.huangfugui.spring.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by huangfugui on 2017/5/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class IndustrySmallMapperTest {

    @Autowired
    private IndustrySmallMapper industrySmallMapper;

    @Test
    public void selectBySmallId() throws Exception {
        IndustrySmall industrySmall = industrySmallMapper.selectBySmallId(1);
        System.out.println(industrySmall);
    }

}