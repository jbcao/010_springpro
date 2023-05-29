package h_myaop.myaop4;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 3:55 PM
 */
public class Agent implements Service {
    Service target;//传入目标
    Aop aop;//传入切面

    //构造方法完成初始化
    public Agent(Service target, Aop aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            //切面   事务 日志 权限
            aop.before();
            //业务 图书 商品
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
            e.printStackTrace();
        }

    }
}
