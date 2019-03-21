package com.manage.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.manage.model.Employee;
import com.manage.service.EmployeeService;

@Controller
public class EmployeeController {
 
    @Autowired
    private EmployeeService empService;
 
    @GetMapping("/")
    public String userForm(Locale locale, Model model) {
        model.addAttribute("employees", empService.list());
        return "editEmployee";
    }
     
    @ModelAttribute("employee")
    public Employee formBackingObject() {
        return new Employee();
    }
 
    @PostMapping("/addEmployee")
    public String saveUser(@ModelAttribute("employee") @Valid Employee employee,
                            BindingResult result, Model model) {
 
        if (result.hasErrors()) {
            model.addAttribute("employees", empService.list());
            return "editEmployee";
        }
 
        empService.save(employee);
        return "redirect:/";
    }
}