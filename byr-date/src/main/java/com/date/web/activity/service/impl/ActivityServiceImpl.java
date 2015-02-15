/**
 * 
 */
package com.date.web.activity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.activity.bo.Activity;
import com.date.web.activity.dao.ActivityDao;
import com.date.web.activity.service.ActivityService;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.dormitory.bo.Dormitory;
import com.date.web.dormitory.service.DormitoryService;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Autowired
    private DormitoryService dormitoryService;

    @Override
    public ActivityVo getActivityVo(Dormitory dormitory) {
        // TODO Auto-generated method stub
        Activity activity = activityDao.getActivity(dormitory);
        if (null == activity) {
            return null;
        }
        Long id;
        if (dormitory.getGender() == 1) {
            id = activity.getGirl();
        } else {
            id = activity.getBoy();

        }

        DormitoryVo dormitoryVo = dormitoryService.getDormitoryVo(id);

        ActivityVo activityVo = new ActivityVo(activity);
        activityVo.setDormitoryVo(dormitoryVo);

        return activityVo;
    }
}
