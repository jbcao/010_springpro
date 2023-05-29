package j_aspectj.s04;

import org.springframework.stereotype.Service;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 3:06 PM
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, Integer age) {
        System.out.println("dosome目标方法执行。。。。。");
        //System.out.println(1/0);
        return "abcd";
    }
}
