/**
 * 
 */
package com.date.web.account.dao;

import com.date.web.account.bo.Account;

/**
 * @author xuesong03
 * 
 */
public interface AccountDao {
    public Account findAcct(Account account);

    public Account FindAcctByName(String name);

    public void insertAcct(Account acct);

}
