import org.huangfugui.ibatis.mapper.PeriodMapper;
import org.huangfugui.ibatis.po.Period;
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
public class PeriodMapperTest {
    @Autowired
    private PeriodMapper periodMapper;
    @Test
    public void selectById() throws Exception {
        Period period = periodMapper.selectById(1);
        System.out.println(period);
    }
}