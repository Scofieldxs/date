/**
 * 
 */
package com.date.web.account.action;

import java.util.List;

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
import com.date.web.dormitory.bo.Person;
import com.date.web.dormitory.dao.DormitoryDao;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

/**
 * @author xuesong03
 * 
 */
@Controller
public class RegistAction {

    @Autowired
    private AccountService accountService;

    @Autowired
    private DormitoryDao dormitoryDao;

    @RequestMapping(value = "/regist/account", method = RequestMethod.POST)
    public String regist(HttpServletRequest request,
            @RequestParam(required = false, value = "name", defaultValue = "") String name,
            @RequestParam(required = false, value = "password", defaultValue = "") String password, Model model) {

        if (Strings.isNullOrEmpty(name) || Strings.isNullOrEmpty(password)) {
            model.addAttribute("result", "用户名或密码不能为空");
            return "account/regist";
        }

        try {
            password = MD5Trans.encode(password);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("result", "用户名或密码不能为空");
            return "account/regist";
        }

        Account account = accountService.FindAcctByName(name);
        if (account != null) {
            model.addAttribute("result", "用户名已存在！");
            return "account/regist";
        }

        request.getSession().setAttribute("account", account);
        return "account/dormitory";

    }

    @RequestMapping(value = "/regist/dormitory", method = RequestMethod.POST)
    public String dormitory(HttpServletRequest request,
            @RequestParam(required = false, value = "city", defaultValue = "") Integer city,
            @RequestParam(required = false, value = "school", defaultValue = "") Integer school,
            @RequestParam(required = false, value = "gender", defaultValue = "") Integer gender,
            @RequestParam(required = false, value = "grade", defaultValue = "") Integer grade,
            @RequestParam(required = false, value = "major", defaultValue = "") Integer major,
            @RequestParam(required = false, value = "qq", defaultValue = "") String qq, Model model) {

        Dormitory dormitory = new Dormitory();
        dormitory.setCity(city);
        dormitory.setSchool(school);
        dormitory.setGender(gender);
        dormitory.setGrade(grade);
        dormitory.setMajor(major);
        dormitory.setQq(qq);

        Long id = dormitoryDao.insertDormitory(dormitory);

        Account account = (Account) request.getSession().getAttribute("account");
        account.setDormitory(id);
        accountService.insertAcct(account);

        return "account/person";
    }

    @RequestMapping(value = "/regist/person", method = RequestMethod.POST)
    public String person(HttpServletRequest request,
            @RequestParam(required = false, value = "nameList", defaultValue = "") List<String> nameList,
            @RequestParam(required = false, value = "singleList", defaultValue = "") List<Integer> singleList,
            @RequestParam(required = false, value = "pictureList", defaultValue = "") List<Object> pictureList,
            Model model) {

        if (nameList.isEmpty() || singleList.isEmpty() || pictureList.isEmpty()) {
            model.addAttribute("result", "不能为空哦");
            return "account/person";
        }

        Account account = (Account) request.getSession().getAttribute("account");

        List<Person> persons = Lists.newArrayList();
        int count = nameList.size();
        for (int i = 0; i < count; i++) {
            Person person = new Person();
            person.setName(nameList.get(i));
            person.setSingle(singleList.get(i));
            person.setDormitory(account.getDormitory());
            if (i < pictureList.size()) {
                person.setPicture(pictureList.get(i));
            }
            persons.add(person);
        }

        dormitoryDao.insertPersons(persons);

        return "redirect:/plan/show";

    }
}
