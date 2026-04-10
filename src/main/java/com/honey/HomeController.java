package com.honey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String home(@org.jetbrains.annotations.NotNull Model model) {
        model.addAttribute("message", "Hello Honey!");
        model.addAttribute("subtitle", "This is my server.");
        return "home";
    }
}
