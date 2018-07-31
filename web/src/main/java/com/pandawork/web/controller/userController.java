//package com.pandawork.web.controller;
//
//import com.pandawork.core.common.exception.SSException;
//import com.pandawork.core.common.log.LogClerk;
//import com.pandawork.web.spring.AbstractController;
//import com.pandawork.common.entity.User;
//import com.pandawork.service.userService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.Collections;
//import java.util.List;
//
//@Controller
//@RequestMapping("/student")
//public class userController extends AbstractController {
//
//    //遍历user
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String userList(Model model) {
//        try {
//            List<User> list = Collections.emptyList();
//            list = userService.listAll();
//            model.addAttribute("userList", list);
//            return "userList";
//        } catch (SSException e) {
//            LogClerk.errLog.error(e);
//            sendErrMsg(e.getMessage());
//            return ADMIN_SYS_ERR_PAGE;
//        }
//    }
//
//    //增加user
//
//    @RequestMapping(value = "/new", method = RequestMethod.POST)
//    public void addUser(User user, RedirectAttributes redirectAttributes) {
//        try {
//            userService.addUser(user);
//            redirectAttributes.addFlashAttribute("message", "注册成功！");
//            return "redirect:/user/list";
//        } catch (SSException e) {
//            LogClerk.errLog.error(e);
//            sendErrMsg(e.getMessage());
//            return ADMIN_SYS_ERR_PAGE;
//        }
//    }
//
//    //查询user
//    @RequestMapping(value = "query/{name}", method = RequestMethod.GET)
//    public void selectUser(@RequestParam("name") String name) {
//        try {
//            userService.selectUser(name);
//            return "redirect:/user/list";
//        } catch (SSException e) {
//            LogClerk.errLog.error(e);
//            sendErrMsg(e.getMessage());
//            return ADMIN_SYS_ERR_PAGE;
//        }
//    }
//
//    //退出登录
//}