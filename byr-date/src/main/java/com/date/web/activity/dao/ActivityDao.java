/**
 * 
 */
package com.date.web.activity.dao;

import java.util.LinkedList;

import com.date.web.activity.bo.Activity;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.dormitory.bo.Dormitory;

/**
 * @author xuesong03
 * 
 */
public interface ActivityDao {
    public void insertActivities(LinkedList<Activity> acts);

    public void insertActivity(Activity activity);

    public ActivityVo getActivityVo(Long id);

    public Activity getActivity(Dormitory dormitory);

}
