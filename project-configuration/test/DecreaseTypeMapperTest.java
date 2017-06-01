import org.huangfugui.ibatis.mapper.DecreaseTypeMapper;
import org.huangfugui.ibatis.po.DecreaseType;
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
public class DecreaseTypeMapperTest {

    @Autowired
    private DecreaseTypeMapper decreaseTypeMapper;

    @Test
    public void selectById() throws Exception {
        DecreaseType decreaseType = decreaseTypeMapper.selectById(1);
        System.out.println(decreaseType);
    }
}