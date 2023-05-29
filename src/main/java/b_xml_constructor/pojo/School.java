package b_xml_constructor.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 4:34 PM
 */
public class School {
    private String name;
    private String address;
    //使用带参数构造方法

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
