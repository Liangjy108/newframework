package com.pandawork.service.impl;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.common.entity.Person;
import com.pandawork.mapper.PersonDao;
import com.pandawork.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.net.ssl.SSLException;
import java.util.Collections;
import java.util.List;

import static com.pandawork.core.common.util.Assert.isNotNull;
import static com.pandawork.core.common.util.Assert.lessOrEqualZero;
import static org.springframework.util.Assert.*;


@Service("personService")
public class personServiceImpl implements personService {
    @Autowired
    PersonDao personDao;

    //遍历person

    @Override
    public List<Person>listAll()throws SSException {
        List<Person> personList = Collections.emptyList();
        try {
            personList = personDao.listAllPerson();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }



    //增加person

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void addPerson(Person person) throws SSException {
        if (Assert.isNull(person)) {
            return;
        }
        Assert.lessOrEqualZero(person.getId());
        Assert.isNotNull(person.getName(), NFException.PersonNameNotNull);
        isNotNull(person.getBirthday(), NFException.BirthdayNotNull);
        isNotNull(person.getDepartment(), NFException.DepartmentNotNull);
        isNotNull(person.getTeam(), NFException.TeamNotNull);
        isNotNull(person.getComment(), NFException.CommentNotNull);
        try {
            personDao.addPerson(person);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

//    //删除person
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
//    public void delPerson(String name)throws SSException{
//        if (Assert.lessOrEqualZero()) {
//            return false;
//        }
//        try {
//            return personDao.delPerson(name);
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.DelStudentNull, e);
//        }
//    }
//
//    //修改person
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
//    public void updatePerson(Person person,String name)throws SSException{
//        if (Assert.isNotNull(person))
//            return;
//        try {
//            personDao.updatePerson(Person person,String name);
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.UpdateStudentFailed, e);
//        }
//    }
//
//    //查询person
//    @Override
//    public void selectPerson(String name)throws SSException{
//        if (!Assert.isNull(name)) {
//            return null;
//        }
//        try {
//            return personDao.selectPerson(String name);
//        } catch (Exception e) {
//            LogClerk.errLog.error(e);
//            throw SSException.get(NFException.QueryByNameFailed, e);
//        }
//    }
}
