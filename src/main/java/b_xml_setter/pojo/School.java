package b_xml_setter.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 11:38 AM
 */
public class School {
    private String name;
    private String address;
    //setter注入方式，必须提供午餐构造方法，以及setter方法

    public School() {
        System.out.println("学校无参的构造方法被调用。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
