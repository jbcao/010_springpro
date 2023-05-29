
import e_annotation.s06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 9:40 PM
 */
public class E {
    @Test
    public void testS04(){
        //spring容器对象创建并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
    }
    //引用类型的注入
    @Test
    public void testS05(){
        //spring容器对象创建并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
    }
    //引用类型的注入
    //父子类型
    @Test
    public void testS06(){
        //spring容器对象创建并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s06/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
    }
}
