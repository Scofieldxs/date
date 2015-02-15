/**
 * 
 */
package com.date.web.dict.dao;

/**
 * @author xuesong03
 * 
 */
public interface ActDao {

    public Integer getActId(String name);

    public String getActName(Integer id);

    public Integer insertAct(String name);
}
