/**
 * 
 */
package com.date.web.dict.service;

/**
 * @author xuesong03
 * 
 */
public interface ActService {
    public Integer getActId(String name);

    public String getActName(Integer id);

    public Integer insertAct(String name);

}
