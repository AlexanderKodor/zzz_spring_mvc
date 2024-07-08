package com.alex.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details";
    }

    //    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String name = request.getParameter("employeeName");
//        name = "Мистер " + name;
//        model.addAttribute("nameAttribute", name);
//        return "show-emp-details";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String name, Model model) {
//        name = "Мистер " + name;
//        model.addAttribute("nameAttribute", name);
//        return "show-emp-details";
//    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp) {

        return "show-emp-details";
    }
}
