/**
 * 
 */
package com.date.web.account.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.account.bo.Account;
import com.date.web.account.dao.AccountDao;
import com.date.web.account.dao.AccountMapper;

/**
 * @author xuesong03
 * 
 */
@Service("accountDao")
public class AccountDaoImpl extends SqlSessionDaoSupport implements AccountDao {

    @Autowired
    private AccountMapper accountMapper;

    @Resource(name = "sessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Resource(name = "jdbcTemplate")
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public Account findAcct(Account account) {
        // TODO Auto-generated method stub
        return accountMapper.findAcct(account);
    }

    @Override
    public Account FindAcctByName(String name) {
        // TODO Auto-generated method stub
        return accountMapper.FindAcctByName(name);
    }

    @Override
    public void insertAcct(Account acct) {
        // TODO Auto-generated method stub
        accountMapper.insertAcct(acct);

    }

}
