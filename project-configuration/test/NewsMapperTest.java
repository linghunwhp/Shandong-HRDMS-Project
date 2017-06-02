import org.huangfugui.ibatis.mapper.NewsMapper;
import org.huangfugui.spring.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Liubaiyu on 2017/5/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class NewsMapperTest {
    @Autowired
    private NewsMapper newsMapper;
    @Test
    public void selectAll() throws Exception {
        System.out.println(newsMapper.selectAll());
    }

    @Test
    public void releaseNews() throws Exception {

    }

}