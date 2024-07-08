package com.alex.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControllerDefault {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
}
