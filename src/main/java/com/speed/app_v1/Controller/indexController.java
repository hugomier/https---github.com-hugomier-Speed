package com.speed.app_v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class indexController {
    @GetMapping("/index")
    public String index () {
        return "index";
    }

    @GetMapping("/mision")
    public String mision () {
        return "mision";
    }
    
    @GetMapping("/vision")
    public String vision () {
        return "vision";
    }
    
    @GetMapping("/valores")
    public String valores () {
        return "valores";
    }

    @GetMapping("/servicios")
    public String servicios () {
        return "servicios";
    }
    
}
