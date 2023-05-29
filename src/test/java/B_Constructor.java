import b_xml_constructor.pojo.School;
import b_xml_constructor.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 5:09 PM
 */
public class B_Constructor {
    @Test
    public void testSchool() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        School school = (School) applicationContext.getBean("school");
        System.out.println(school);
    }

    @Test
    public void testStu() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
    }

    @Test
    public void testStuSquence() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stuSquence");
        System.out.println(student);
    }

}
