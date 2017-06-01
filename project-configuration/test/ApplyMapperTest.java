import org.huangfugui.ibatis.mapper.ApplyMapper;
import org.huangfugui.ibatis.po.Apply;
import org.huangfugui.spring.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by huangfugui on 2017/6/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class ApplyMapperTest {

    @Autowired
    private ApplyMapper applyMapper;

    @Test
    public void selectByUserId() throws Exception {
        List<Apply> applies = applyMapper.selectByUserId(1);
        for(Apply apply:applies){
            System.out.println(apply);
        }
    }
}