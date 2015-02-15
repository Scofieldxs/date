/**
 * 
 */
package com.date.web.dormitory.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.dormitory.bo.Dormitory;
import com.date.web.dormitory.bo.Person;
import com.date.web.dormitory.dao.DormitoryDao;
import com.date.web.dormitory.dao.DormitoryMapper;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
@Service("dormitoryDao")
public class DormitoryDaoImpl implements DormitoryDao {

    @Autowired
    private DormitoryMapper dormitoryMapper;

    @Override
    public DormitoryVo getDormitoryVo(Long id) {
        // TODO Auto-generated method stub
        return dormitoryMapper.getDormitoryVo(id);
    }

    @Override
    public List<Person> getPersons(Long id) {
        // TODO Auto-generated method stub
        return dormitoryMapper.getPersons(id);
    }

    @Override
    public Long insertDormitory(DormitoryVo domVo) {
        // TODO Auto-generated method stub
        return dormitoryMapper.insertDormitory(domVo);
    }

    @Override
    public Long updateDormitory(DormitoryVo domVo) {
        // TODO Auto-generated method stub
        return dormitoryMapper.updateDormitory(domVo);
    }

    @Override
    public void insertPerson(Person person) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updatePerson(Person person) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insertPersons(List<Person> persons) {
        // TODO Auto-generated method stub
        dormitoryMapper.insertPersons(persons);
    }

    @Override
    public Person findPerson(Long id) {
        // TODO Auto-generated method stub
        return dormitoryMapper.findPerson(id);
    }

    @Override
    public Long insertDormitory(Dormitory dormitory) {
        // TODO Auto-generated method stub
        return dormitoryMapper.insertDormitory(dormitory);
    }

    @Override
    public Dormitory getDormitory(Long id) {
        // TODO Auto-generated method stub
        return dormitoryMapper.getDormitory(id);

    }
}
