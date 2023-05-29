import h_myaop.myaop5.*;
import org.junit.Test;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 5:09 PM
 */
public class H05 {
    @Test
    public void test(){
        Service service = (Service) AgentFactory.gatAgent(new BookServiceImpl(),new TransAop());
        service.buy();
    }
    //灵活切换方法，有参数，有返回值
    @Test
    public void test1(){
        Service service = (Service) AgentFactory.gatAgent(new BookServiceImpl(),new TransAop());
        String res = service.show(12);
        System.out.println(res);
    }
    //织入多个切面
    @Test
    public void test2(){
        Service service = (Service) AgentFactory.gatAgent(new BookServiceImpl(),new TransAop());
        Service service1 = (Service) AgentFactory.gatAgent(service,new LogAop());
        String res = service1.show(12);
        System.out.println(res);
    }

}
