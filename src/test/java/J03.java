import j_aspectj.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 3:18 PM
 */
public class J03 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("j/s03/applicationContext.xml");
            SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
            String res=someService.doSome("张三",89);
            System.out.println(res);
    }
}
