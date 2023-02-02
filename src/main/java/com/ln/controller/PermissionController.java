package com.ln.controller;

import com.ln.service.PermisssionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pc")
public class PermissionController {

    @Autowired
    private PermisssionService permisssionService;


}
