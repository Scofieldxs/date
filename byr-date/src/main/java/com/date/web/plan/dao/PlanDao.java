/**
 * 
 */
package com.date.web.plan.dao;

import com.date.web.plan.bo.Plan;
import com.date.web.plan.vo.PlanVo;
import com.sun.tools.javac.util.List;

/**
 * @author xuesong03
 * 
 */
public interface PlanDao {
    public Integer insertPlan(Plan plan);

    public void removePlan(Long domId);

    public Plan getPlanById(Integer id);

    public List<Plan> getPlans(Integer gender);

    public void insertPlans(List<Plan> plans);

    public Plan matchPlan(Plan plan);

    public PlanVo getPlanVo(Long id);

}
