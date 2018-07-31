package com.pandawork.web.controller;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.web.spring.AbstractController;
import com.pandawork.common.entity.Person;
import com.pandawork.service.personService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/student")
public class personController extends AbstractController {

    //遍历person

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String personList(Model model) {
        try {
            List<Person> list = Collections.emptyList();
            list = personService.listAll();
            model.addAttribute("personList", list);
            return "personList";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    //增加person

    @RequestMapping(value ="/new", method = RequestMethod.POST)
    public void addPerson(Person person, RedirectAttributes redirectAttributes) {
        try {
            personService.addPerson(person);
            redirectAttributes.addFlashAttribute("message", "添加成功！");
            return "redirect:/person/list";
        } catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    //删除person

    @RequestMapping(value = "delete/{name}", method = RequestMethod.GET)
    public String delete(@PathVariable("name") String name) {
        try {
            personService.delPerson(name);
            return "redirect:/person/list";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    //修改person

    @RequestMapping(value = "update/{name}", method = RequestMethod.GET)
    public void updatePerson(Person person, @PathVariable("name") String name) {
        try {
            if(!Assert.isNotNull(person)){
                return null;
            }
            personService.updatePerson(name);
            return "redirect:/person/list";
        } catch (SSException e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    //查询person

    @RequestMapping(value ="query/{name}",method = RequestMethod.GET)
    public void selectPerson(@RequestParam("name") String name) {
        try {
            personService.selectPerson(name);
            return "redirect:/person/list";
        } catch (SSException e ){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

//    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
//    public String edit(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
//        redirectAttributes.addAttribute("id", id);
//        return "edit";
//    }


//    //增加页面
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String toNewStudent(){
//        return "add";
//    }


}
