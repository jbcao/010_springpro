package e_annotation.s04;

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

    public Student() {
        System.out.println("student无参构造函数呗调用");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
