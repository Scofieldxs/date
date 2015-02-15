/**
 * 
 */
package com.date.web.account.action;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.date.web.account.bo.Account;
import com.date.web.account.service.AccountService;
import com.date.web.common.trans.MD5Trans;
import com.date.web.dormitory.bo.Dormitory;
import com.date.web.dormitory.service.DormitoryService;
import com.google.common.base.Strings;

/**
 * @author xuesong03
 * 
 */
@Controller
public class AccountAction {

    @Autowired
    private AccountService accountService;

    @Autowired
    private DormitoryService dormitoryService;

    /**
     * 获得用户
     * 
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public String loginCheck(HttpServletRequest request,
            @RequestParam(required = false, value = "name", defaultValue = "") String name,
            @RequestParam(required = false, value = "password", defaultValue = "") String password, Model model) {

        if (Strings.isNullOrEmpty(name) || Strings.isNullOrEmpty(password)) {
            model.addAttribute("result", "用户名或密码不能为空");
            return "account/login";
        }

        Account account = new Account();
        account.setName(name);
        try {
            account.setPassword(MD5Trans.encode(password));
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            model.addAttribute("result", "用户名或密码不能为空");
            return "account/login";
        }

        account = accountService.findAcct(account);
        if (account == null) {
            model.addAttribute("result", "用户名或密码错误");
            return "account/login";
        }
        Dormitory dormitory = dormitoryService.getDormitory(account.getDormitory());

        request.getSession().setAttribute("dormitory", dormitory);

        return "redirect:/activity/show";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "account/login";
    }

}
