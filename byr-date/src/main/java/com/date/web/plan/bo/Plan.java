/**
 * 
 */
package com.date.web.plan.bo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xuesong03
 * 
 */
public class Plan {

    @Setter
    @Getter
    private Long dormitory;

    @Setter
    @Getter
    private Date time;

    @Setter
    @Getter
    private Integer actId;

    @Setter
    @Getter
    private Integer gender;

}
