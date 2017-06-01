import org.huangfugui.ibatis.mapper.FactorMapper;
import org.huangfugui.ibatis.po.Factor;
import org.huangfugui.spring.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by huangfugui on 2017/6/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class FactorMapperTest {

    @Autowired
    private FactorMapper factorMapper;

    @Test
    public void selectById() throws Exception {
        Factor factor = factorMapper.selectById(1);
        System.out.println(factor);
    }

}