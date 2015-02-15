/**
 * 
 */
package com.date.web.dict.dao;

import com.date.web.common.mybatis.SqlMapper;

/**
 * @author xuesong03
 * 
 */
@SqlMapper
public interface ActMapper {

    public Integer getActId(String name);

    public String getActName(Integer id);

    public Integer insertAct(String name);

    public void addCount(Integer id);

}
