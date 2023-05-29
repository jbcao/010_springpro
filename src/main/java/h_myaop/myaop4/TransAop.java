package h_myaop.myaop4;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 3:53 PM
 */
public class TransAop implements Aop {
    @Override
    public void before() {
        System.out.println("开启事务。。。");
    }

    @Override
    public void after() {
        System.out.println("提交事务。。。");
    }

    @Override
    public void exception() {
        System.out.println("回滚事务。。。");
    }
}
