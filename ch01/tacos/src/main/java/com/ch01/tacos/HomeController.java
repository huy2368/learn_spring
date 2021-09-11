package com.ch01.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // Spring MVC: use controller to map endpoint to static content (html file)
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/test")
	public String test() {
		return "test";
	}
}
