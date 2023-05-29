package h_myaop.myaop2;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 2:15 PM
 */
public class SubBookServiceImpl extends BookServiceImpl {
    @Override
    public void buy() {
        try {
            //事务切面
            System.out.println("开启事务。。。。");
            //主业务实现
            super.buy();
            //事务切面
            System.out.println("提交事务。。。。");
        } catch (Exception e) {
            //事务切面
            System.out.println("回滚事务。。。。");
            e.printStackTrace();
        }
    }
}
