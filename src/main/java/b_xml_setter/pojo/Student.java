package b_xml_setter.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 11:56 AM
 */
public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {
        System.out.println("学生无参构造函数。。。。。。");
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
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
