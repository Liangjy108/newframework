//package com.pandawork.service.impl;
//
//import com.pandawork.common.utils.NFException;
//import com.pandawork.core.common.exception.SSException;
//import com.pandawork.core.common.log.LogClerk;
//import com.pandawork.service.userService;
//import com.pandawork.common.entity.User;
//import com.pandawork.mapper.UserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.util.Assert;
//
//import javax.net.ssl.SSLException;
//import java.util.Collections;
//import java.util.List;
//
//@Service("userService")
//public class userServiceImpl implements userService {
//   @Autowired
//    UserDao userDao;
//
//    //遍历user
//    @Override
//    public void listAll()throws SSLException {
//        List<User> userList = Collections.emptyList();
//        try {
//            userList = userDao.listAllUser();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }
//   //增加用户
//   @Override
//   @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSLException.class, Exception.class, RuntimeException.class})
//   public void addUser(User user) throws SSException {
//       if (Assert.isNull(user)) {
//           return;
//       }
//       Assert.lessOrEqualZero(user.getId(), NFException.StudentNumLessOrEqualZero);
//       Assert.isNotNull(user.getUserName(), NFException.SexNotNull);
//       Assert.isNotNull(user.getPassword(), NFException.);
//       Assert.isNotNull(user.getPhone(), NFException.CollegeNotNull);
//       Assert.isNotNull(user.getQq(), NFException.BirthdayNotNull);
//       Assert.isNotNull(user.getEmail(), NFException.GoodStudentNotNull);
//       try {
//           userDao.addUser(user);
//       } catch (Exception e) {
//           LogClerk.errLog.error(e);
//           throw SSLException.get(NFException.SystemException, e);
//       }
//   }
//
//   //查询用户
//   @Override
//   public void selectUser(String userName)throws SSException{
//       if (!Assert.isNull(userName)) {
//           return null;
//       }
//       try {
//           return userDao.selectUser(String userName);
//       } catch (Exception e) {
//           LogClerk.errLog.error(e);
//           throw SSException.get(NFException.QueryByNameFailed, e);
//       }
//   }
//
////写在controller里
////    @Override
////    public void logout()throws SSLException{
////
////    }
//}
