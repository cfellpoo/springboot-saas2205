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
@RequestMapping("/rc")
public class RoleController {

    @Autowired
    private RoleService roleService;


    /**
     * 跳转角色index页面_不分页
     *
     * @param model 全部角色数据
     * @return /role/index.jsp
     */
    @RequestMapping("/toRcIndex")
    public String toindex(Model model) {
        List<UserView> all = roleService.findAllRole();
        model.addAttribute("list", all);
        return "/role/index";
    }


    /**
     * 跳转角色index页面_分页
     *
     * @param model     全部角色数据_分页
     * @param startPage 页面         defaultValue=1
     * @param pageSize  每页多少条数据 defaultValue=10
     * @return /role/index.jsp
     */
    @RequestMapping("/toindex_page")
    public String toindex_page(Model model,
                               @RequestParam(defaultValue = "1", required = false)
                                       Integer startPage,
                               @RequestParam(defaultValue = "10", required = false)
                                       Integer pageSize,
                               @RequestParam(defaultValue = "",required = false) String likeName_respon) {

        //起始页= 开始页-1*每页的条数
        Integer startPage_req = (startPage - 1) * pageSize;

        HashMap<Object, Object> map = new HashMap<>();
        map.put("startPage", startPage_req);
        map.put("Pagesize", pageSize);
        map.put("likeName", "%"+likeName_respon+"%");


        //总页数 = 总条数%pageSize并向上取整
        double totalno2 = roleService.roleCount("%"+likeName_respon+"%") % pageSize / 10.0;
        System.out.println(totalno2);
        double totalno = Math.ceil(roleService.roleCount("%"+likeName_respon+"%") / pageSize + totalno2);
        List<UserView> all = roleService.findAllRole_page(map);
        System.out.println(totalno);

        model.addAttribute("list", all);
        model.addAttribute("totalno", totalno);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("likeName_respon", likeName_respon);
        model.addAttribute("pageno", startPage);
        return "/role/index";
    }


}
