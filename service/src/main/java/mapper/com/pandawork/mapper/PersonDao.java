package com.pandawork.mapper;
import com.pandawork.common.entity.Person;
import org.apache.ibatis.annotations.Param;
import java.util.List;

//11111

/**
 * person对应的数据库操作方法
 */
public interface PersonDao {
    /**
     * 增加
     *
     * @param person
     * @return
     */
    public boolean addPerson(@Param("person") Person person) throws Exception;

//    /**
//     * 删除
//     *
//     * @param name
//     * @return
//     */
//    public boolean delPerson(@Param("person") String name) throws Exception;
//
//    /**
//     * 修改
//     *
//     * @param person
//     * @return
//     */
//    public boolean updatePerson(@Param("person") Person person, String name1) throws Exception;
//
//    /**
//     * 查询
//     *
//     * @param name
//     * @return
//     */
//    //通过名字进行查询
//
//    public List<Person> selectPerson(@Param("name") String name) throws Exception;
//
//
    /**
     * 遍历list
     *
     * @return
     */
    public List<Person> listAllPerson() throws Exception;
}