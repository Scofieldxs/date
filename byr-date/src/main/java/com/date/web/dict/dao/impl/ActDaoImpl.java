/**
 * 
 */
package com.date.web.dict.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.dict.dao.ActDao;
import com.date.web.dict.dao.ActMapper;

/**
 * @author xuesong03
 * 
 */
@Service("actDao")
public class ActDaoImpl implements ActDao {

    @Autowired
    private ActMapper actMapper;

    @Override
    public Integer getActId(String name) {
        // TODO Auto-generated method stub
        Integer id = actMapper.getActId(name);
        if (null != id) {
            actMapper.addCount(id);
        }
        return id;
    }

    @Override
    public String getActName(Integer id) {
        // TODO Auto-generated method stub
        return actMapper.getActName(id);
    }

    @Override
    public Integer insertAct(String name) {
        // TODO Auto-generated method stub
        return actMapper.insertAct(name);
    }

}
