package g_split.service.impl;

import g_split.dao.UsersMapper;
import g_split.pojo.Users;
import g_split.service.UsersService;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:57 PM
 */
public class UsersServiceImpl implements UsersService {
    //所有的业务逻辑层都必须有数据访问层的对象
    private UsersMapper usersMapper;
    //setter方式注入需要有setter方法

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
