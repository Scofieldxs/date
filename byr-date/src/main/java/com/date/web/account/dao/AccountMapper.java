/**
 * 
 */
package com.date.web.account.dao;

import com.date.web.account.bo.Account;
import com.date.web.common.mybatis.SqlMapper;

/**
 * @author xuesong03
 * 
 */
@SqlMapper
public interface AccountMapper {
    public Account findAcct(Account account);

    public Account FindAcctByName(String name);

    public void insertAcct(Account acct);

}
