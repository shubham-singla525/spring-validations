package com.spring.mvc.validator.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String getCustomer(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

}
