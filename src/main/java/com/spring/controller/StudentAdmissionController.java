package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//using ModelAndView
@Controller
public class StudentAdmissionController {
    @GetMapping("/admissionForm.html")
    public ModelAndView getAdmissionForm(){
        ModelAndView model = new ModelAndView("AdmissionForm");
        return model;
    }

    @PostMapping("/submitAdmissionForm.html")
    public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> parameters){
        String name = parameters.get("studentName");
        String hobby = parameters.get("studentHobby");
        ModelAndView model = new ModelAndView("AdmissionSuccess");
        model.addObject("msg", "Details submitted by::: Name: " + name + ", hobby: " + hobby);
        return model;
    }
}

