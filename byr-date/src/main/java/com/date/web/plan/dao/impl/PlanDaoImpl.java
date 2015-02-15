/**
 * 
 */
package com.date.web.plan.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.plan.bo.Plan;
import com.date.web.plan.dao.PlanDao;
import com.date.web.plan.dao.PlanMapper;
import com.date.web.plan.vo.PlanVo;
import com.sun.tools.javac.util.List;

/**
 * @author xuesong03
 * 
 */
@Service("planDao")
public class PlanDaoImpl implements PlanDao {

    @Autowired
    private PlanMapper planMapper;

    @Override
    public Integer insertPlan(Plan plan) {
        // TODO Auto-generated method stub
        return planMapper.insertPlan(plan);
    }

    @Override
    public Plan getPlanById(Integer id) {
        // TODO Auto-generated method stub
        return planMapper.getPlanById(id);
    }

    @Override
    public List<Plan> getPlans(Integer gender) {
        // TODO Auto-generated method stub
        return planMapper.getPlans(gender);
    }

    @Override
    public void removePlan(Long domId) {
        // TODO Auto-generated method stub
        planMapper.removePlan(domId);
    }

    @Override
    public void insertPlans(List<Plan> plans) {
        // TODO Auto-generated method stub
        planMapper.insertPlans(plans);
    }

    @Override
    public Plan matchPlan(Plan plan) {
        // TODO Auto-generated method stub
        return planMapper.matchPlan(plan);
    }

    @Override
    public PlanVo getPlanVo(Long id) {
        // TODO Auto-generated method stub
        return planMapper.getPlanVo(id);
    }

}
