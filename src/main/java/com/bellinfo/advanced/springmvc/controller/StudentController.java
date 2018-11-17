package com.bellinfo.advanced.springmvc.controller;


import com.bellinfo.advanced.springmvc.model.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "login";
    }

    @RequestMapping(value = "/student", method= RequestMethod.GET)
    public String getStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "login";
    }


    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Student student, Model model){
        String welcome = "Hey" + student.getName() +" Welcome to Spring MVC Learning";
        model.addAttribute("message", welcome);
        return "success";
    }

}
