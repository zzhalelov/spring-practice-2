package kz.itproger.spring_practice_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }
}