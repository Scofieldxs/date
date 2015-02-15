/**
 * 
 */
package com.date.web.dormitory.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xuesong03
 * 
 */
public class Person {
    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private Long dormitory;

    @Setter
    @Getter
    private Integer single;

    @Setter
    @Getter
    private Object picture;

}
