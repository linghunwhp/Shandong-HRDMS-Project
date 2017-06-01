
import org.huangfugui.ibatis.enums.UserType;
import org.huangfugui.ibatis.mapper.UserMapper;
import org.huangfugui.ibatis.po.User;
import org.huangfugui.spring.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByUsernameAndPassword() throws Exception {
        User user = userMapper.selectByUsernameAndPassword("黄复贵","123");
        System.out.println(user);
    }
}