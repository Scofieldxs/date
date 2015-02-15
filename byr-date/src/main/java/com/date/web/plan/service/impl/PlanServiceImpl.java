/**
 * 
 */
package com.date.web.plan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.activity.bo.Activity;
import com.date.web.activity.dao.ActivityDao;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.common.Constants.Constants;
import com.date.web.common.trans.TimeTrans;
import com.date.web.dict.dao.ActDao;
import com.date.web.dormitory.dao.DormitoryDao;
import com.date.web.dormitory.vo.DormitoryVo;
import com.date.web.plan.bo.Plan;
import com.date.web.plan.dao.PlanDao;
import com.date.web.plan.service.PlanService;
import com.date.web.plan.vo.PlanVo;

/**
 * @author xuesong03
 * 
 */
@Service("planService")
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    private ActivityDao activityDao;

    @Autowired
    private ActDao actDao;

    @Autowired
    private DormitoryDao dormitoryDao;

    @Override
    public Plan insertPlan(Plan plan) {
        // TODO Auto-generated method stub
        Integer id = planDao.insertPlan(plan);
        return planDao.getPlanById(id);
    }

    @Override
    public ActivityVo matchPlan(Plan plan) {
        // TODO Auto-generated method stub
        Plan oppPlan = planDao.matchPlan(plan);

        // 没有匹配上则插入数据库
        if (oppPlan == null) {
            planDao.insertPlan(plan);
            return null;
        }

        // 匹配上则删除数据库
        planDao.removePlan(plan.getDormitory());
        planDao.removePlan(oppPlan.getDormitory());

        Activity activity = new Activity();
        if (oppPlan.getGender() == Constants.GENDER_BOY) {
            activity.setBoy(oppPlan.getDormitory());
            activity.setGirl(plan.getDormitory());
        } else {
            activity.setBoy(plan.getDormitory());
            activity.setGirl(oppPlan.getDormitory());
        }
        activity.setAct(plan.getActId());
        activity.setTime(plan.getTime());

        activityDao.insertActivity(activity);

        ActivityVo actVo = new ActivityVo();
        try {
            actVo.setTime(TimeTrans.DateToString(plan.getTime()));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String actName = actDao.getActName(plan.getActId());
        actVo.setActivity(actName);

        DormitoryVo dormitoryVo = dormitoryDao.getDormitoryVo(oppPlan.getDormitory());

        dormitoryVo.setPersons(dormitoryDao.getPersons(oppPlan.getDormitory()));

        actVo.setDormitoryVo(dormitoryVo);

        return actVo;

    }

    @Override
    public PlanVo getPlanVo(Long id) {
        // TODO Auto-generated method stub
        return planDao.getPlanVo(id);
    }
}
