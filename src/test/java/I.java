import i_spring_aop.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 7:08 PM
 */
public class I {
    @Test
    public  void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("i/applicationContext.xml");
        BookService proxy = (BookService) ac.getBean("bookService");
        System.out.println(proxy.getClass());
        proxy.buy("张三","平凡的世界",55);
        proxy.comment("张三","还是很好看,可以看一看.....");
    }
}
