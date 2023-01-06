package com.st1.platform.carpark;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/carparks")
@Controller
public class CarparkController {

    @GetMapping
    public String carparks(ModelMap map){

        return "carparks/index";
    }

}

