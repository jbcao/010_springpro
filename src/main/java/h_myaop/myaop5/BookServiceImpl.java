package h_myaop.myaop5;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 2:43 PM
 */
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("购买图书。。。。");
    }

    @Override
    public String show(Integer age) {
        System.out.println("该商品年龄是"+age);
        return "该商品年龄是"+age;
    }
}
