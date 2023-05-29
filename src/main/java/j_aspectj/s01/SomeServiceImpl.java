package j_aspectj.s01;

import org.springframework.stereotype.Service;

/**
 * 功能 业务实现类
 *
 * @author caojianbang
 * @date 12.8.22 4:07 PM
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void show() {
        System.out.println("目标对象show方被调用");
    }

    @Override
    public String doSome(String name, Integer age) {
        System.out.println("dosome的功能实现。。。。。");
        return "abcd";
    }
}
