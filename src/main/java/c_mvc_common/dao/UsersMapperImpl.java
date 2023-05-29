package c_mvc_common.dao;

import c_mvc_common.pojo.Users;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:46 PM
 */
public class UsersMapperImpl implements UsersMapper {
    @Override
    public int insert(Users users) {
        System.out.println(users.getUname()+"用户添加成功");
        return 1;
    }
}
