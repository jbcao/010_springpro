import c_mvc_common.controller.UsersController;
import c_mvc_common.pojo.Users;
import org.junit.Test;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 1:35 PM
 */
public class C {
    @Test
    public void insert() {
        // 创建界面层usercontroller的对象
        UsersController usersController = new UsersController();
        int res = usersController.insert(new Users(100, "jjj", 99));
        System.out.println(res);
    }
}
