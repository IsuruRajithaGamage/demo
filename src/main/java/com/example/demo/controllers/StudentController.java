package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping("/page1")
    public ModelAndView getPage1(){
        return new ModelAndView("page1.html");
    }
    @RequestMapping("/demo1")
    public ModelAndView getDemo(){
        return new ModelAndView("demo.html");
    }
    @RequestMapping("/index")
    public ModelAndView getIndex(){
        return new ModelAndView("index.html");
    }



}
