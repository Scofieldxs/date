/**
 * 
 */
package com.date.web.account.service;

import com.date.web.account.bo.Account;

/**
 * @author xuesong03
 * 
 */
public interface AccountService {

    public Account findAcct(Account account);

    public Account FindAcctByName(String name);

    public void insertAcct(Account acct);

}
