package d_mvc_xml.c_mvc_common.controller;

import d_mvc_xml.c_mvc_common.pojo.Users;
import d_mvc_xml.c_mvc_common.service.UsersService;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 1:20 PM
 */
public class UsersController {
    //如何去访问业务逻辑层，就是创建对象
    //切记切记：所有界面层都有业务逻辑层的对象
    public UsersService usersService;// = new UsersServiceImpl();
    //spring依赖注入，必须提供setter方法

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    //界面层功能的实现，对外提供访问的功能
    public int insert(Users users) {
        return usersService.insert(users);
    }
}
