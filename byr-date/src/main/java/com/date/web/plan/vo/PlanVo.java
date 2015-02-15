/**
 * 
 */
package com.date.web.plan.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xuesong03
 * 
 */
public class PlanVo {

    @Setter
    @Getter
    private Long dormitory;

    @Setter
    @Getter
    private Date time;

    @Setter
    @Getter
    private String timeString;

    @Setter
    @Getter
    private Integer actId;

    @Setter
    @Getter
    private String activity;

    @Setter
    @Getter
    private Integer gender;

}
