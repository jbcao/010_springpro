package c_mvc_common.service.impl;

import c_mvc_common.dao.UsersMapper;
import c_mvc_common.dao.UsersMapperImpl;
import c_mvc_common.pojo.Users;
import c_mvc_common.service.UsersService;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:57 PM
 */
public class UsersServiceImpl implements UsersService {
    //所有的业务逻辑层都必须有数据访问层的对象
    private UsersMapper usersMapper = new UsersMapperImpl();
    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
