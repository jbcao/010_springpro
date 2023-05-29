package k_sm.service.impl;

import k_sm.mapper.AccountsMapper;
import k_sm.pojo.Accounts;
import k_sm.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能
 *
 * @author caojianbang
 * @date 14.8.22 4:03 PM
 */
@Service
//@Transactional(propagation = Propagation.REQUIRED,noRollbackForClassName = "ArithmeticException",noRollbackFor = ArithmeticException.class,timeout = -1,readOnly = false,isolation =Isolation.DEFAULT )
@Transactional(propagation =Propagation.NEVER)
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;
    @Override
    public int save(Accounts accounts) {
        int num=0;
        num = accountsMapper.save(accounts);
        System.out.println("成功添加"+num);
        //手动添加异常
        System.out.println(1/0);
        return num;
    }
}
