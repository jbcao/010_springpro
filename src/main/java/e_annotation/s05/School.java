package e_annotation.s05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 11:11 PM
 */
@Component
public class School {
    @Value("清华大学")
    private String name;
    @Value("北京海淀区")
    private String address;

    public School() {
        System.out.println("school无参构造方法被调用");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
