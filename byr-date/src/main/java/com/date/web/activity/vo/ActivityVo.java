/**
 * 
 */
package com.date.web.activity.vo;

import lombok.Data;

import com.date.web.activity.bo.Activity;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
@Data
public class ActivityVo {

    private String time;

    private String activity;

    private DormitoryVo dormitoryVo;

    public ActivityVo(Activity activity) {
        if (null != activity) {
            this.time = activity.getTime().toString();
            this.activity = activity.getActivity();

        }
    }

}
