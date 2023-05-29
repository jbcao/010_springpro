package h_myaop.myaop1;

/**
 * 功能：业务和事务（切面）耦合在一起
 *
 * @author caojianbang
 * @date 10.8.22 10:52 PM
 */
public class BookServiceImpl {
    public void buy(){
        try {
            System.out.println("开启事务，，，");
            System.out.println("购买图书，，，");
            System.out.println("提交事务，，，");
        } catch (Exception e) {
            System.out.println("回滚事务，，，");
            e.printStackTrace();
        }

    }
}
