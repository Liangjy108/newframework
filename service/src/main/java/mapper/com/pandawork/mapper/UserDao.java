//package com.pandawork.mapper;
//
//import com.pandawork.common.entity.User;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
///**
// * user对应的数据库操作方法
// */
//
//
//public interface UserDao {
//
//    /**
//     * 查询（根据用户名判断用户是否存在）（即登陆和查重）
//     * @param userName
//     * @return
//     */
//    public User selectUser(@Param("user") String userName) throws Exception;
//
//    /**
//     * 判断密码是否正确
//     * @param password
//     * @return boolean
//     */
//    public boolean passwordIsTrue(@Param("user") String userName, Integer password) throws Exception;
//
//    /**
//     * 增加（即注册）
//     * @param user
//     * @return
//     */
//    public boolean addUser(@Param("user") User user) throws Exception;
//
//
//    /**
//     * 遍历list
//     * @return
//     */
//    public List<User> listAllUser() throws Exception;
}