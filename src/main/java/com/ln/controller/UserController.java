package com.ln.controller;

import com.ln.pojo.UserView;
import com.ln.service.RoleService;
import com.ln.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private RoleService roleService;


    @Autowired
    private UserService userService;

    /**
     * 请求跟目录
     *
     * @return login
     */
    @RequestMapping("/")
    public String defaultPage() {
        return "login";
    }

    /**
     * 跳转login页面
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }


    /**
     * 登录查询用户和密码是否正确存在
     *
     * @param userView 前端传输数据
     * @return ok/no
     */
    @RequestMapping("/loginUser")
    @ResponseBody
    public String loginUser(UserView userView) {
        UserView userViews = userService.loginUser(userView);
        if (userViews != null) {
            return "ok";
        } else return "no";
    }


    /**
     * 跳转主页面
     *
     * @return main
     */
    @RequestMapping("/tomain")
    public String tomain() {
        return "main";
    }


    /**
     * 跳转index页面_不分页
     *
     * @param model 全部用户数据
     * @return index.jsp
     */
    @RequestMapping("/toindex")
    public String toindex(Model model) {
        List<UserView> all = userService.findAll();
        model.addAttribute("list", all);
        return "index";
    }


    /**
     * 跳转index页面_分页
     *
     * @param model     全部用户数据_分页
     * @param startPage 页面         defaultValue=1
     * @param pageSize  每页多少条数据 defaultValue=10
     * @return index.jsp
     */
    @RequestMapping("/toindex_page")
    public String toindex_page(Model model,
                               @RequestParam(defaultValue = "1", required = false)
                                       Integer startPage,
                               @RequestParam(defaultValue = "10", required = false)
                                       Integer pageSize,
                               @RequestParam(defaultValue = "", required = false) String likeName_respon) {


        //起始页= 开始页-1*每页的条数
        Integer startPage_req = (startPage - 1) * pageSize;

        HashMap<Object, Object> map = new HashMap<>();
        map.put("startPage", startPage_req);
        map.put("Pagesize", pageSize);
        map.put("likeName", "%" + likeName_respon + "%");
        map.put("likeName", "%" + likeName_respon + "%");


        //总页数 = 总条数%pageSize并向上取整
        double totalno2 = userService.UserCount("%" + likeName_respon + "%") % pageSize / 10.0;
        double totalno = Math.ceil(userService.UserCount("%" + likeName_respon + "%") / pageSize + totalno2);
        List<UserView> all = userService.findAll_page(map);

        model.addAttribute("list", all);
        model.addAttribute("totalno", totalno);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageno", startPage);
        model.addAttribute("likeName", likeName_respon);
        return "index";
    }


    /**
     * 跳转添加页面
     *
     * @return add.jsp
     */
    @RequestMapping("/toadd")
    public String toadd() {
        return "add";
    }


    /**
     * 根据id删除用户
     *
     * @param id 要删除的用户id
     * @return 是否删除成功 ok/no
     */
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


    /**
     * 添加用户
     *
     * @param userView 要添加的用户信息实体类
     * @return 是否添加成功 ok/no
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(UserView userView) {
        try {
            //手动设置用户随机UUID
            userView.setId(UUID.randomUUID().toString());
            //手动设置用户密码为123
            userView.setUserpswd("123");

            userService.addUser(userView);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }


    /**
     * 跳转修改页面
     *
     * @param id    要修改的用户id
     * @param model 前端回显用户信息
     * @return edit.jsp
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id, Model model) {
        //根据用户id查询到用户 并存入到model供前端回显
        UserView userById = userService.findUserById(id);
        model.addAttribute("findUser", userById);
        return "edit";
    }

    /**
     * 根据id修改用户信息
     *
     * @param userView 前端传递的修改的用户信息
     * @return 是否修改成功 ok/no
     */
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


    /**
     * 根据id批量删除用户
     *
     * @param ids 要删除的用户id数组
     * @return 是否删除成功 ok/no
     */
    @RequestMapping("/deluserss")
    @ResponseBody
    public String deluserss(String[] ids) {
        try {
            userService.deluserss(ids);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }

    /**
     *
     * @param model list：用户已分配角色、unlist：用户未分配角色
     * @param id 用户id
     * @return  asign页面
     */
    @RequestMapping("/asignUser")
    public String asignUser(Model model, String id) {
        //已分配
        model.addAttribute("list", roleService.findRoleById_un(id));

        //未分配
        model.addAttribute("unlist", roleService.findRoleById(id));

        model.addAttribute("id", id);
        return "role/asign";
    }


    /**
     * 修改用户角色
     *
     * @return ok/no
     */
    @RequestMapping("/addUeserRole")
    @ResponseBody
    public String addUeserRole(String userid, String[] doroel) {
//        System.out.println(userid );
//        System.out.println(doroel);

        try {
            userService.addUserRole(userid, doroel);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }

    }

    /**
     * 删除用户角色
     *
     * @return ok/no
     */
    @RequestMapping("/delUserRole")
    @ResponseBody
    public String delUserRole(String userid, String[] roleun) {
        try {
            userService.delUserRole(userid, roleun);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }


}
