package e_annotation.s06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 功能
 *
 * @author caojianbang
 * @date 10.8.22 2:14 PM
 */
@Component
public class SubSchool extends School {
    @Value("清华大学附小")
    private String name;
    @Value("北京海淀区")
    private String address;

    public SubSchool() {
        System.out.println("school子类无参构造方法被调用");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
