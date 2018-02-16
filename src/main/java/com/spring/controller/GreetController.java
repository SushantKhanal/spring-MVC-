package com.spring.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;

//using ModelAndView
//@Controller
//public class GreetController {
//    @GetMapping("/greet/{name}")
//    public ModelAndView greet(@PathVariable String name){
//        ModelAndView modelAndView = new ModelAndView("greet");
//        modelAndView.addObject("greet",name);
//        String greet =" Hello !!!" + name + " How are You?";
//        System.out.println(greet);
//
//        return modelAndView;
//    }
//}
//using ModelMap
@Controller
//@RequestMapping("/")
public class GreetController {
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping("/")
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "greet";
    }
    //@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    @GetMapping("/helloagain")
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World AGAIN from spring 4 MVC");
        return "greet";
    }

}

