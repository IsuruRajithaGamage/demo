package com.example.demo.controllers;

import com.example.demo.model.Students;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/students")
    public String listStudents(HttpServletRequest request, Model model){
        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students("Isuru",24));
        studentsList.add(new Students("Rajitha",24));

        model.addAttribute("studentList", studentsList);
        return "students";


    }


    @RequestMapping("/create")
    public String createStudent(@ModelAttribute Students students,Model model){
        System.out.println(students.getName());
        System.out.println(students.getAge());

        return "greeting";
    }

    @RequestMapping("/new")
    public String newStudent(Model model) {
        Students students = new Students();
        model.addAttribute("students", students);
        return "form";
    }
}
