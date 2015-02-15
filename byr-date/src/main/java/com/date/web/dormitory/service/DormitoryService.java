/**
 * 
 */
package com.date.web.dormitory.service;

import java.util.List;

import com.date.web.dormitory.bo.Dormitory;
import com.date.web.dormitory.bo.Person;
import com.date.web.dormitory.vo.DormitoryVo;

/**
 * @author xuesong03
 * 
 */
public interface DormitoryService {
    public DormitoryVo getDormitoryVo(Long id);

    public void saveOrUpdateDormitory(DormitoryVo dormitoryVo);

    public Long insertDormitory(Dormitory dormitory);

    public void insertPersons(List<Person> persons);

    public Dormitory getDormitory(Long id);

}
