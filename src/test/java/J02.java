import j_aspectj.s02.SomeService;
import j_aspectj.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 12:51 PM
 */
public class J02 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("j/s02/applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        String res=someService.doSome("张三",88);
        System.out.println(res);
    }
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("j/s02/applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        Student student=someService.change();
        System.out.println(student);
    }
}
