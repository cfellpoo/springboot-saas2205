package com.ln.controller;

import com.ln.pojo.UserView;
import com.ln.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

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
                               @RequestParam(defaultValue = "", required = false) String likeName_respon) {

        //如果页面为0 页面为1
        if (startPage == 0) {
            startPage = 1;
        }

        //总页数 = 总条数/pageSize并向上取整
        double totalno = Math.ceil(1.0 * roleService.roleCount("%" + likeName_respon + "%") / pageSize);

        //如果页面大于总页数 页面=最大页数
        if (startPage > totalno) {
            Double aDouble = new Double(totalno);

            startPage = aDouble.intValue();
        }
        //起始页= 开始页-1*每页的条数
        Integer startPage_req = (startPage - 1) * pageSize;

        HashMap<Object, Object> map = new HashMap<>();
        map.put("startPage", startPage_req);
        map.put("Pagesize", pageSize);
        map.put("likeName", "%" + likeName_respon + "%");



//        double totalno2 = roleService.roleCount("%"+likeName_respon+"%") % pageSize / 10.0;
//        double totalno = Math.ceil(roleService.roleCount("%"+likeName_respon+"%") / pageSize + totalno2);

        List<UserView> all = roleService.findAllRole_page(map);

        map.put("likeName", "%"+likeName_respon+"%");


        //总页数 = 总条数%pageSize并向上取整
        double totalno2 = roleService.roleCount("%"+likeName_respon+"%") % pageSize / 10.0;
//        double totalno = Math.ceil(roleService.roleCount("%"+likeName_respon+"%") / pageSize + totalno2);
        List<UserView> all1 = roleService.findAllRole_page(map);
        System.out.println(totalno);
        model.addAttribute("list", all);
        model.addAttribute("totalno", totalno);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("likeName_respon", likeName_respon);
        model.addAttribute("pageno", startPage);
        return "/role/index";
    }

//    @RequestMapping("/goadd")
//    public String goadd(){
//        return "role/add";
//    }
        @RequestMapping("/goadd")
        public String goadd(){
             return "role/add";
        }
}


