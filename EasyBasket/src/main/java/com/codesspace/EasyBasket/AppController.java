package com.codespace.EasyBasket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    // @RequestMapping("/") // root of the webapp
    // public String home() {
    //     return "home-page.html";
    // }

    @RequestMapping("/homepage") // endpoint - /homepage
    public String homePage(Model model) {
        model.addAttribute("name", "Kumar");
        return "home-page";
    }
}
