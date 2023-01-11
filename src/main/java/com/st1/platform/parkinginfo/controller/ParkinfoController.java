package com.st1.platform.parkinginfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/parkinfos")
@Controller
public class ParkinfoController {

    @GetMapping
    public String parkinfos(ModelMap map){

        return "parkinfos/index";
    }

}

