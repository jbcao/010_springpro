package j_aspectj.s02;

import org.springframework.stereotype.Service;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 12:40 PM
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name,int age) {
        System.out.println("目标方法被调用");
        return "abcd";
    }

    @Override
    public Student change() {
        System.out.println("change()方法被执行。。");
        return new Student("张三",90);
    }
}
