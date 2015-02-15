/**
 * 
 */
package com.date.web.activity.service;

import com.date.web.activity.vo.ActivityVo;
import com.date.web.dormitory.bo.Dormitory;

/**
 * @author xuesong03
 * 
 */
public interface ActivityService {
    public ActivityVo getActivityVo(Dormitory dormitory);

}
