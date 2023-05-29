import k_sm.pojo.Accounts;
import k_sm.pojo.Usersm;
import k_sm.service.AccountsService;
import k_sm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能
 *
 * @author caojianbang
 * @date 14.8.22 2:49 PM
 */
public class K {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("k/applicationContext_trans.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        int num = userService.insert(new Usersm(6,"张三","99"));
    }
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("k/applicationContext_service.xml");
        AccountsService accountsService = (AccountsService) applicationContext.getBean("accountsServiceImpl");
        System.out.println(accountsService.getClass());//是代理类
        accountsService.save(new Accounts(10,"李四","账户安全"));
    }
}
