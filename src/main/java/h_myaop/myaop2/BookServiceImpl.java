package h_myaop.myaop2;

/**
 * 功能 使用子类代理将业务和切面进行拆分
 *
 * @author caojianbang
 * @date 11.8.22 2:12 PM
 */
public class BookServiceImpl {
    public void buy(){
        System.out.println("购买图书");
    }
}
