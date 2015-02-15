/**
 * 
 */
package com.date.web.dormitory.dao;

import java.util.List;

import com.date.web.dormitory.bo.Dormitory;
import com.date.web.dormitory.bo.Person;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
public interface DormitoryDao {

    public DormitoryVo getDormitoryVo(Long id);

    public List<Person> getPersons(Long id);

    public Long insertDormitory(DormitoryVo domVo);

    public Long updateDormitory(DormitoryVo domVo);

    public void insertPerson(Person person);

    public void updatePerson(Person person);

    public void insertPersons(List<Person> persons);

    public Person findPerson(Long id);

    public Long insertDormitory(Dormitory dormitory);

    public Dormitory getDormitory(Long id);

}
