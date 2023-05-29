package f_mvc_annotation.controller;

import f_mvc_annotation.pojo.Users;
import f_mvc_annotation.service.UsersService;
import f_mvc_annotation.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 1:20 PM
 */
@Controller
public class UsersController {
    //如何去访问业务逻辑层，就是创建对象
    //切记切记：所有界面层都有业务逻辑层的对象
    @Autowired
    public UsersService usersService;

    //界面层功能的实现，对外提供访问的功能
    public int insert(Users users) {
        return usersService.insert(users);
    }
}
