package e_annotation.s05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 9:27 PM
 */
@Component("stu") //交给spring去创建对象，就是在容器启动时创建
public class Student {
    @Value("曹建邦")
    private String name;
    @Value("29")
    private int age;
    @Autowired
    @Qualifier("school")//根据名称注入，两个注解配合使用
    private School school;

    public Student() {
        System.out.println("student无参构造函数呗调用");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
