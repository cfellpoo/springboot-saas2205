package com.ln.controller;
/**
 * 递归多次访问数据库
 * 尽量不要使用
 */

import com.ln.pojo.PermissionView;
import com.ln.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pc")
public class PermissionController {

    @Autowired
    private PerService perService;

    @Autowired
    private PerService perSerivce;

    @RequestMapping("/go_permission")
    public String go_permission() {
        return "permission/index";
    }

    @RequestMapping("/getTreeInfo")
    @ResponseBody
    public List<PermissionView> toPerInfo(PermissionView permission) {

//        ArrayList<PermissionView> permissionViews = new ArrayList<>();

//        PermissionView permissionView = new PermissionView();
//        permissionView.setPid("0");
        List<PermissionView> per = perSerivce.findPer();
        return per;

//        permission.setId("0");
//        findAllper(permission);
//
//
//
//        findAllper(permission);
//        System.out.println(permission);
//        return permission.getChildren();
    }

//    private void findAllper_V2(PermissionView permissionView) {
//        permissionView.setPid(permissionView.getId());
//        List<PermissionView> per = perSerivce.findPer(permissionView);
//        for (PermissionView permission2 : per) {
//            findAllper(permission2);
//        }
//        permissionView.setChildren(per);
//    }

//    private void findAllper(PermissionView permissionView) {
//        permissionView.setPid(permissionView.getId());
//        List<PermissionView> per = perSerivce.findPer(permissionView);
//        for (PermissionView permission2 : per) {
//            findAllper(permission2);
//        }
//        permissionView.setChildren(per);
//    }


}
