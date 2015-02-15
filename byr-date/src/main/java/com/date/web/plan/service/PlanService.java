/**
 * 
 */
package com.date.web.plan.service;

import com.date.web.activity.vo.ActivityVo;
import com.date.web.plan.bo.Plan;
import com.date.web.plan.vo.PlanVo;

/**
 * @author xuesong03
 * 
 */
public interface PlanService {

    public Plan insertPlan(Plan plan);

    public ActivityVo matchPlan(Plan plan);

    public PlanVo getPlanVo(Long id);

}
