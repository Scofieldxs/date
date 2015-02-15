/**
 * 
 */
package com.date.web.dict.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.dict.dao.ActDao;
import com.date.web.dict.service.ActService;

/**
 * @author xuesong03
 * 
 */
@Service("actService")
public class ActServiceImpl implements ActService {

    @Autowired
    private ActDao actDao;

    @Override
    public Integer getActId(String name) {
        // TODO Auto-generated method stub
        return actDao.getActId(name);
    }

    @Override
    public String getActName(Integer id) {
        // TODO -generated method stub
        return actDao.getActName(id);
    }

    @Override
    public Integer insertAct(String name) {
        // TODO Auto-generated method stub
        return actDao.insertAct(name);
    }

}
