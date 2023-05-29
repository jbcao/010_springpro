import j_aspectj.s01.SomeService;
import j_aspectj.s01.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 12.8.22 5:40 PM
 */
public class J {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("j/applicationContext.xml");
        //可以使用SomeService 也可以使用SomeServiceImpl去接
        //如果是代理对象，则必须用SomeService，因为功能经过增强，SomeServiceImpl接不住，SomeService可以
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        System.out.println(someService.getClass());
        someService.doSome("张三",90);
        someService.show();
    }
}
