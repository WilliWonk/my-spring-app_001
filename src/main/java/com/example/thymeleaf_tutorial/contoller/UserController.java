package com.example.thymeleaf_tutorial.contoller;

import com.example.thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler method to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("Ramo"
                , "ram@gmail.com"
                , "ADMIN"
                , "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //handler method to handle variable-expression request
    //http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Hikmet"
                , "hik@gmail.com"
                , "ADMIN"
                , "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handler method to handle message-expression request
    //http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    //handler method to handle link-expression
    //http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handler method to handle fragment-expression
    //http://localhost:8080/link-expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users( Model model){
        User admin = new User("Admin"
                , "ad@gmail.com"
                , "ADMIN"
                , "Male");
        User rames = new User("Ramis"
                , "rad@gmail.com"
                , "USER"
                , "Male");
        User meena = new User("Meena"
                , "meena@gmail.com"
                , "USER"
                , "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(rames);
        users.add(meena);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users-status")
    public String users_s( Model model){
        User admin = new User("Admin"
                , "ad@gmail.com"
                , "ADMIN"
                , "Male");
        User rames = new User("Ramis"
                , "rad@gmail.com"
                , "USER"
                , "Male");
        User meena = new User("Meena"
                , "meena@gmail.com"
                , "USER"
                , "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(rames);
        users.add(meena);
        model.addAttribute("users", users);
        return "users-status";
    }

    @GetMapping("/if-unless")
    public String ifUnless( Model model){
        User admin = new User("Admin"
                , "ad@gmail.com"
                , "ADMIN"
                , "Male");
        User rames = new User("Ramis"
                , "rad@gmail.com"
                , "USER"
                , "Male");
        User meena = new User("Meena"
                , "meena@gmail.com"
                , "USER"
                , "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(rames);
        users.add(meena);
        model.addAttribute("users", users);
        return "if-unless";
    }




}
