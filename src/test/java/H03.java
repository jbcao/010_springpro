import h_myaop.myaop3.Agent;
import h_myaop.myaop3.BookServiceImpl;
import h_myaop.myaop3.ProductServiceImpl;
import h_myaop.myaop3.Service;
import org.junit.Test;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 2:47 PM
 */
public class H03 {
    @Test
    public void test(){
        //Service service = new Agent(new BookServiceImpl());
        Service service = new Agent(new ProductServiceImpl());
        service.buy();
    }
}
