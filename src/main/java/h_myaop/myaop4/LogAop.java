package h_myaop.myaop4;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 3:53 PM
 */
public class LogAop implements Aop{
    @Override
    public void after() {
        System.out.println("after日志。。。");
    }

    @Override
    public void exception() {
        System.out.println("exceptioon日志。。。");
    }

    @Override
    public void before() {
        System.out.println("before日志输出。。。");
    }
}
