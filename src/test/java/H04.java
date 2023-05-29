import h_myaop.myaop4.*;
import org.junit.Test;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 4:07 PM
 */
public class H04 {
    @Test
    public void test(){
        Service agent = new Agent(new BookServiceImpl(),new TransAop());
        //包多层切面
        Service agent1 = new Agent(agent,new LogAop());
        agent1.buy();
    }
}
