package b_xml_constructor.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 5:00 PM
 */
public class Student {
    private String name;
    private Integer age;
    private School school;

    public Student(String name, Integer age, School school) {
        this.name = name;
        this.age = age;
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
