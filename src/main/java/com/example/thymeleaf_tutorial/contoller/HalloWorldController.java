package com.example.thymeleaf_tutorial.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HalloWorldController {

    //handler method to handle /helloworld request
    //@GetMapping to handle http get request
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    //model interface
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World");
        model.addAttribute("message1", "Hallo Welt");
        model.addAttribute("message2", "to use Thymeleaf syntax, we should declare this namespace\n" +
                "        at the beginning of the HTML page");
        model.addAttribute("message3", "Hello World Primjer");

        return "hello-world";
    }

}
