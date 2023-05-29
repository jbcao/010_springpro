package k_sm.service.impl;

import k_sm.mapper.UserMapper;
import k_sm.pojo.Accounts;
import k_sm.pojo.Usersm;
import k_sm.service.AccountsService;
import k_sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能
 *
 * @author caojianbang
 * @date 14.8.22 2:36 PM
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    AccountsService accountsService;
    @Override
    public int insert(Usersm usersm) {
        int num=0;
        num=userMapper.insert(usersm);
        num=accountsService.save(new Accounts(06,"张三","很好"));
        return num;
    }
}
