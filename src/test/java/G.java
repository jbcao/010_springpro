import g_split.controller.UsersController;
import g_split.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 10.8.22 4:57 PM
 */
public class G {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("g/total.xml");
        UsersController usersController = (UsersController) applicationContext.getBean("uController");
        usersController.insert(new Users(11,"曹建邦",90));
        System.out.println(usersController);
    }
}
