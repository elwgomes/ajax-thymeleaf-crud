package com.elwgomes.springbootthymeleafajax.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elwgomes.springbootthymeleafajax.services.EmployeeService;

@Controller
public class EmployeeController {
    

    @Autowired
    private EmployeeService service;

    @RequestMapping(value = "/employees")
    public String showEmployee (Model model) {
    model.addAttribute("employees", service.findAll());
        return "showdata";
    }
}
