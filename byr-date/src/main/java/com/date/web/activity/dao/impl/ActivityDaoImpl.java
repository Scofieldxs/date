/**
 * 
 */
package com.date.web.activity.dao.impl;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.activity.bo.Activity;
import com.date.web.activity.dao.ActivityDao;
import com.date.web.activity.dao.ActivityMapper;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.dormitory.bo.Dormitory;

/**
 * @author xuesong03
 * 
 */
@Service("ActivityDao")
public class ActivityDaoImpl implements ActivityDao {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public void insertActivities(LinkedList<Activity> acts) {
        // TODO Auto-generated method stub
        activityMapper.insertActivities(acts);

    }

    @Override
    public void insertActivity(Activity activity) {
        // TODO Auto-generated method stub
        activityMapper.insertActivity(activity);

    }

    @Override
    public ActivityVo getActivityVo(Long id) {
        // TODO Auto-generated method stub
        return activityMapper.getActivityVo(id);
    }

    @Override
    public Activity getActivity(Dormitory dormitory) {
        // TODO Auto-generated method stub
        return activityMapper.getActivity(dormitory);
    }

}
