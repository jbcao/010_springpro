import d_mvc_xml.c_mvc_common.controller.UsersController;
import d_mvc_xml.c_mvc_common.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 2:27 PM
 */
public class D {
    @Test
    public void test(){
        //创建容器并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //取出对象
        UsersController usersController = (UsersController) applicationContext.getBean("uController");
        //测试功能
        usersController.insert(new Users(11,"张三",90));
    }
}
