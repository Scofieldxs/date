/**
 * 
 */
package com.date.web.dormitory.vo;

import java.util.List;

import lombok.Data;

import com.date.web.dormitory.bo.Person;

/**
 * @author xuesong03
 * 
 */
@Data
public class DormitoryVo {

    private Integer id;

    private String city;

    private String school;

    private String grade;

    private String major;

    private Integer identified;

    private Integer gender;

    private String qq;

    private List<Person> persons;

}
