import a_programmer.pojo.Student;

import b_xml_setter.pojo.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能:测试正转
 *     程序员创建对象，依赖注入
 *
 * @author caojianbang
 * @date 9.8.22 12:20 AM
 */
public class A {
    @Test
    public void testStudent(){
        //程序员创建对此昂
        Student stu = new Student();
        System.out.println(stu);
    }
    @Test
    public void testStudentSpring(){
        //由spring容器进行对象的创建

        //如果想从spring容器中取出对象，则需要先创建容器对象，并启动才可以取对象,如下
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student stu= (Student) applicationContext.getBean("stu");
        System.out.println(stu);
    }
    @Test
    public void testSchool(){
        //创建容器对象并启动
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        School school = (School) applicationContext.getBean("school");
        System.out.println(school);
    }

}
