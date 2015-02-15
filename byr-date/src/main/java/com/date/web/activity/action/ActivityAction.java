/**
 * 
 */
package com.date.web.activity.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.date.web.activity.service.ActivityService;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.dormitory.bo.Dormitory;

/**
 * @author xuesong03
 * 
 */
@Controller
@RequestMapping("/activity")
public class ActivityAction {

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String loginCheck(HttpServletRequest request, Model model) {

        Dormitory dormitory = (Dormitory) request.getSession().getAttribute("dormitory");
        if (dormitory == null) {
            return "account/login";
        }

        ActivityVo activityVo = activityService.getActivityVo(dormitory);

        if (activityVo == null) {
            return "redirect:/plan/show";
        } else {
            model.addAttribute("activity", activityVo);
            model.addAttribute("id", dormitory.getId());
            return "activity/showAct";
        }

    }

}
