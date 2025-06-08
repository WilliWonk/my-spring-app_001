package com.example.thymeleaf_tutorial.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HalloWorldController {
    @GetMapping()
    //model interface
    public String pocetnaStrana(Model model){
        model.addAttribute("message", "Hello World");
        model.addAttribute("message1", "Hallo Welt");
        model.addAttribute("message2", "to use Thymeleaf syntax, we should declare this namespace\n" +
                "        at the beginning of the HTML page");
        model.addAttribute("message3", "Hello World Primjer");

        return "index";
    }

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

    @GetMapping("/boja")
    public String prikaziStranicu(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("message1", "Hallo Welt");
        model.addAttribute("message2", "to use Thymeleaf syntax, " +
                "we should declare this namespace\n" +
                " at the beginning of the HTML page");
        model.addAttribute("message3", "Hello World Primjer");
        model.addAttribute("boja", "lightgreen"); // uvijek zelena
        return "hello-world";
    }

    @GetMapping("/boja1")
    public String prikaziStranicu1(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("message1", "Hallo Welt");
        model.addAttribute("message2", "to use Thymeleaf syntax, " +
                "we should declare this namespace\n" +
                "        at the beginning of the HTML page");
        model.addAttribute("message3", "Hello World Primjer");
        model.addAttribute("boja", "yellow"); // uvijek zuta
        return "hello-world";
    }

    @GetMapping("/povratak")
    public String prikaziStranicuHome(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("message1", "Hallo Welt");
        model.addAttribute("message2", "to use Thymeleaf syntax, we should declare this namespace\n" +
                "        at the beginning of the HTML page");
        model.addAttribute("message3", "Hello World Primjer");
        return "index";
    }

}
