package com.sac.springwebdemos.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo") 
public class HelloController { // http://localhost:8080/demo
    
    @GetMapping("/hlo") 
    public String sayHello(Model model) { // http://localhost:8080/demo/hlo

        model.addAttribute("name", "abc");
        return "hello";
    }
    //   /WEB-INF/jsp/hello.jsp
}