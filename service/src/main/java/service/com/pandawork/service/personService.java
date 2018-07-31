package com.pandawork.service;

import com.pandawork.common.entity.Person;
import com.pandawork.core.common.exception.SSException;
import java.util.List;

public interface personService {
    /**
     * 主页
     * @return
     * @throws SSException
     */
    public List<Person> listAll()throws SSException;

    /**
     * 增加person
     * @return
     * @throws SSException
     */
    public void addPerson()throws SSException;

//    /**
//     * 删除person
//     * @return
//     * @throws SSLException
//     */
//    public void delPerson()throws SSLException;
//
//    /**
//     * 修改person
//     * @return
//     * @throws SSLException
//     */
//    public void updatePerson()throws SSLException;
//
//    /**
//     * 查询person
//     * @return
//     * @param name
//     * @throws SSLException
//     */
//    public void selectPerson(String name)throws SSLException;
}
