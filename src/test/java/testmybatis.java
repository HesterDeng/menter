import dto.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.UserRepository;

/**
 * Created by xheart on 2016/8/2.
 */
public class testmybatis {
    @Test
    public void testMybatis() throws Exception {
        User user = new User();
        Long l=new Long(6);
        user.setId(l);
        user.setUsername("test");
        user.setPassword("test");
        String conf = "spring-servlet.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        UserRepository userMapper = ac.getBean(UserRepository.class);
        userMapper.save(user);
    }
}
