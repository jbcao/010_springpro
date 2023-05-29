package f_mvc_annotation.service.impl;

import f_mvc_annotation.dao.UsersMapper;
import f_mvc_annotation.dao.UsersMapperImpl;
import f_mvc_annotation.pojo.Users;
import f_mvc_annotation.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:57 PM
 */
@Service
public class UsersServiceImpl implements UsersService {
    //所有的业务逻辑层都必须有数据访问层的对象
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
