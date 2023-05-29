package d_mvc_xml.c_mvc_common.service.impl;

import d_mvc_xml.c_mvc_common.dao.UsersMapper;
import d_mvc_xml.c_mvc_common.pojo.Users;
import d_mvc_xml.c_mvc_common.service.UsersService;

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
