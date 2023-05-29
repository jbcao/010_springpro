
import f_mvc_annotation.controller.UsersController;
import f_mvc_annotation.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 2:27 PM
 */
public class F {
    @Test
    public void test(){
        //创建容器并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("f/total.xml");
        //取出对象
        UsersController usersController = (UsersController) applicationContext.getBean("usersController");
        //测试功能
        usersController.insert(new Users(11,"张三",90));
    }
}
