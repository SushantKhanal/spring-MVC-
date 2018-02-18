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
    public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1){

        ModelAndView model = new ModelAndView("AdmissionSuccess");
        model.addObject("msg", "Congratulations!!! Your form has been processed!!!");
        return model;
    }
}

