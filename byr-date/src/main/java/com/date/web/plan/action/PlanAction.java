/**
 * 
 */
package com.date.web.plan.action;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.date.web.account.bo.Account;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.common.Constants.Constants;
import com.date.web.common.trans.TimeTrans;
import com.date.web.dict.service.ActService;
import com.date.web.plan.bo.Plan;
import com.date.web.plan.service.PlanService;
import com.date.web.plan.vo.PlanVo;
import com.google.common.base.Strings;

/**
 * @author xuesong03
 * 
 */
@Controller
@RequestMapping("/plan")
public class PlanAction {

    @Autowired
    private ActService actService;

    @Autowired
    private PlanService planService;

    /*
     * @RequestMapping(value = "/addPlan", method = RequestMethod.POST) public String loginCheck(@RequestParam(required
     * = false, value = "dormitory", defaultValue = "") Long dormitory,
     * 
     * @RequestParam(required = false, value = "time", defaultValue = "") String time,
     * 
     * @RequestParam(required = false, value = "activity", defaultValue = "") String activity, Model model) throws
     * Exception {
     */
    @RequestMapping(value = "/addPlan", method = RequestMethod.GET)
    public String addPlan() {
        Long dormitory = 1L;
        String time = "20141212";
        String activity = "KTV";
        Integer gender = 1;

        if (dormitory == null || Strings.isNullOrEmpty(time)) {
            return "error";
        }

        Plan plan = new Plan();

        // set dormitory
        plan.setDormitory(dormitory);

        // set gender
        plan.setGender(gender);

        // set time
        Date date = TimeTrans.StringToDate(time);
        if (date == null) {
            return "error";
        }
        plan.setTime(date);

        if (!Strings.isNullOrEmpty(activity)) {
            Integer actId = actService.getActId(activity);
            if (actId == null) {
                actId = actService.insertAct(activity);
            }
            plan.setActId(actId);
        } else {
            plan.setActId(Constants.ACTIVITY_NONE);
        }

        ActivityVo actVo = planService.matchPlan(plan);

        if (actVo == null) {

        }

        // model.addAttribute("plan", plan);

        return "/plan/showplan";
    }

    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public String loginCheck(HttpServletRequest request, Model model) {

        Account account = (Account) request.getSession().getAttribute("account");
        if (account == null) {
            return "account/login";
        }

        PlanVo planVo = planService.getPlanVo(account.getDormitory());

        if (planVo == null) {
            model.addAttribute("result", "还没有计划，先建立一个吧！");
        } else {
            model.addAttribute("plan", planVo);

        }
        return "plan/show";

    }
}
