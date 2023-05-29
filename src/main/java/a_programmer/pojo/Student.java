package a_programmer.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:16 AM
 */
public class Student {
    private String name;
    private int  age;

    public Student() {
        System.out.println("学生无参数构造方法。。。。。。。。。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +

                '}';
    }
}
