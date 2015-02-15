/**
 * 
 */
package com.date.web.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.account.bo.Account;
import com.date.web.account.dao.AccountDao;
import com.date.web.account.service.AccountService;

/**
 * @author xuesong03
 * 
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findAcct(Account account) {
        // TODO Auto-generated method stub
        return accountDao.findAcct(account);
    }

    @Override
    public Account FindAcctByName(String name) {
        // TODO Auto-generated method stub
        return accountDao.FindAcctByName(name);
    }

    @Override
    public void insertAcct(Account acct) {
        // TODO Auto-generated method stub

    }

}
