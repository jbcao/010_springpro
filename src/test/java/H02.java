import h_myaop.myaop2.BookServiceImpl;
import h_myaop.myaop2.SubBookServiceImpl;
import org.junit.Test;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 2:19 PM
 */
public class H02 {
    @Test
    public void test(){
        BookServiceImpl bookService = new SubBookServiceImpl();
        bookService.buy();
    }
}
