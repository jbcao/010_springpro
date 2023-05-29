package h_myaop.myaop3;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 2:45 PM
 */
public class Agent implements Service {
    private Service  target;

    public Agent(Service target) {
        this.target = target;
    }

    @Override
    public void buy() {

        try {
            //事务切面
            System.out.println("开启事务");
            //主业务
            target.buy();
            //事务切面
            System.out.println("提交事务。");
        } catch (Exception e) {
            //事务切面
            System.out.println("回滚事务。。。。");
            e.printStackTrace();
        }

    }
}
