/**
 * 
 */
package com.date.web.activity.bo;

import java.sql.Date;

import lombok.Data;

/**
 * @author xuesong03
 * 
 */
@Data
public class Activity {

    private Date time;

    private Long boy;

    private Long girl;

    private String activity;

}
