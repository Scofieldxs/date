/**
 * 
 */
package com.date.web.dormitory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.web.dormitory.bo.Dormitory;
import com.date.web.dormitory.bo.Person;
import com.date.web.dormitory.dao.DormitoryDao;
import com.date.web.dormitory.service.DormitoryService;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
@Service("dormitoryService")
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    private DormitoryDao dormitoryDao;

    @Override
    public DormitoryVo getDormitoryVo(Long id) {
        // TODO Auto-generated method stub
        DormitoryVo dormitoryVo = dormitoryDao.getDormitoryVo(id);

        dormitoryVo.setPersons(dormitoryDao.getPersons(id));

        return dormitoryVo;
    }

    @Override
    public void saveOrUpdateDormitory(DormitoryVo dormitoryVo) {
        // TODO Auto-generated method stub

        if (dormitoryVo.getId() == null) {
            Long id = dormitoryDao.insertDormitory(dormitoryVo);
            List<Person> persons = dormitoryVo.getPersons();
            for (Person person : persons) {
                person.setDormitory(id);
            }
            dormitoryDao.insertPersons(persons);

        } else {
            dormitoryDao.updateDormitory(dormitoryVo);
            List<Person> persons = dormitoryVo.getPersons();
            for (Person person : persons) {
                Person dataPerson = dormitoryDao.findPerson(person.getId());
                if (null == dataPerson) {
                    dormitoryDao.insertPerson(person);
                } else {
                    dormitoryDao.updatePerson(person);
                }
            }

        }
    }

    @Override
    public Long insertDormitory(Dormitory dormitory) {
        // TODO Auto-generated method stub
        return dormitoryDao.insertDormitory(dormitory);
    }

    @Override
    public void insertPersons(List<Person> persons) {
        // TODO Auto-generated method stub
        dormitoryDao.insertPersons(persons);

    }

    @Override
    public Dormitory getDormitory(Long id) {
        // TODO Auto-generated method stub
        return dormitoryDao.getDormitory(id);

    }

}
