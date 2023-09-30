package com.practice.thymeleafpractical.controllers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    // localhost:8080/about
    @GetMapping("/about")
    public String about(Model model) {

        // putting data into new model
        model.addAttribute("name", "Shabab");
        model.addAttribute("currentDate", new Date().toLocaleString());

        // example
        // String nameString = "abc";
        // nameString.toUpperCase();

        // about.html
        return "about";

    }

    // handler for iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model m) {
        // send

        // create a list, set collection
        List<String> names = List.of("shabab", "prince", "tanvir", "sakib");

        m.addAttribute("namelist", names);
        return "iterate";
    }

    // handler for conditional statements
    @GetMapping("/condition")
    public String conditionHandler(Model m) {

        // System.out.println("conditional handler executed");
        m.addAttribute("isActive", true);
        m.addAttribute("gender", "M");

        List<Integer> list = List.of(23, 26, 45, 67);
        m.addAttribute("mylist", list);

        return "condition";
    }

    // handler for inheriting Replace/Insert/Include fragments
    @GetMapping("/fragments")
    public String fragmentHandler(Model m) {

        System.out.println("Fragment handler executed");

        m.addAttribute("title", "this is footer title");
        m.addAttribute("subtitle", LocalDateTime.now().toString());

        return "fragment";
    }

    // handler for new about
    @GetMapping("/aboutnew")
    public String newAbout() {
        return "aboutnew";
    }

    // handler for contact
    @GetMapping("/contact")
    public String newContact() {
        return "contact";
    }
}
