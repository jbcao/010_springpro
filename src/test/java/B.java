import b_xml_constructor.pojo.School;
import b_xml_setter.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:08 PM
 */
public class B {
    @Test
    public void testStu(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
     }
}
