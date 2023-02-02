package com.ln.controller;

import com.ln.pojo.Permission;
import com.ln.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pc")
public class PermissionController {

    @Autowired
    private PerService perService;

    @Autowired
    private PerService perSerivce;

    @RequestMapping("/go_permission")
    public String go_permission(){
        return "permission/index";
    }

    @RequestMapping("/getTreeInfo")
    @ResponseBody
        public List<Permission> toPerInfo(){
            List<Permission> list =new ArrayList<Permission>();
            Permission permission = perSerivce.findPer();
            list.add(permission);
            return list;
        }
//        PermisssionView allPermission = permisssionService.findAllPermission();
////        ArrayList<PermisssionView> permisssionViews = new ArrayList<>();
//////        permisssionViews.add(allPermission);
////        allPermission.forEach(System.out::println);
//        return "ok";
//    }


}
