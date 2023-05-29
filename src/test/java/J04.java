import j_aspectj.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 4:25 PM
 */
public class J04 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("j/s04/applicationContext.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        someService.doSome("张三", 45);
    }

}
