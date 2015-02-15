/**
 * 
 */
package com.date.web.activity.dao;

import java.util.LinkedList;

import com.date.web.activity.bo.Activity;
import com.date.web.activity.vo.ActivityVo;
import com.date.web.common.mybatis.SqlMapper;
import com.date.web.dormitory.bo.Dormitory;

/**
 * @author xuesong03
 * 
 */
@SqlMapper
public interface ActivityMapper {
    public void insertActivities(LinkedList<Activity> acts);

    public void insertActivity(Activity activity);

    public ActivityVo getActivityVo(Long id);

    public Activity getActivity(Dormitory dormitory);

}
