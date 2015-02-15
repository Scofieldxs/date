/**
 * 
 */
package com.date.web.dormitory.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.date.web.dormitory.service.DormitoryService;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
@Controller
@RequestMapping("/dom")
public class DormitoryAction {

    @Autowired
    private DormitoryService dormitoryService;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getdom(@RequestParam(required = false, value = "id", defaultValue = "") Long id, Model model) {
        if (id == null) {
            return "error";
        }

        DormitoryVo domVo = dormitoryService.getDormitoryVo(id);
        model.addAttribute("dom", domVo);

        return "dom/show";
    }

    @RequestMapping(value = "/updatedom", method = RequestMethod.POST)
    public String updatedom(@RequestParam(required = false, value = "id", defaultValue = "") Long id) {

        DormitoryVo domVo = new DormitoryVo();

        dormitoryService.saveOrUpdateDormitory(domVo);

        return "dom/show";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request, Model model) {

        return null;

    }

}
