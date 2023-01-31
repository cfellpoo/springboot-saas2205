package com.ln.controller;

import com.ln.pojo.UserView;
import com.ln.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login.jsp";
    }

    @RequestMapping("/loginUser")
    @ResponseBody
    public String loginUser(UserView userView) {
//        System.out.println(username);
//        System.out.println(userpswd);
        UserView userViews = userService.loginUser(userView);
        if (userViews != null) {
            return "ok";
        } else return "no";
    }

    @RequestMapping("/tomain")
    public String tomain(UserView userView) {
        return "main.jsp";
    }


    //    全查
    @RequestMapping("/toindex")
    public String toindex(Model model) {
        List<UserView> all = userService.findAll();
        model.addAttribute("list", all);
        return "index.jsp";
    }

    //    全查_分页
    @RequestMapping("/toindex_page")
    public String toindex_page(Model model,
                               @RequestParam(defaultValue = "1", required = false)
                                       Integer startPage,
                               @RequestParam(defaultValue = "10", required = false)
                                       Integer pageSize) {

        Integer startPage_req = (startPage - 1) * pageSize;
        HashMap<Object, Object> map = new HashMap<>();
        map.put("startPage", startPage_req);
        map.put("Pagesize", pageSize);


        List<UserView> all = userService.findAll_page(map);

        model.addAttribute("list", all);
        return "index.jsp";
    }

    @RequestMapping("/toadd")
    public String toadd() {
        return "add.jsp";
    }

    @RequestMapping("/delUserById")
    @ResponseBody
    public String delUserById(int id) {
        try {
            userService.delUserById(id);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(UserView userView) {
        try {
            String s = UUID.randomUUID().toString();
            userView.setId(s);
            userView.setUserpswd("123");
            userService.addUser(userView);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }

    @RequestMapping("/toEdit")
    public String toEdit(Integer id, Model model) {
        UserView userById = userService.findUserById(id);
        model.addAttribute("findUser", userById);
        return "edit.jsp";
    }

    //    修改
    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(UserView userView) {
        try {
            userService.updateUserById(userView);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }

    }


}