package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String welcomePage() {
        return "home";
    }
    @GetMapping("roll-dice")
    public String showRollOptions(){
        return "roll-dice";
    }
    @GetMapping("roll-dice/{num}")
    @ResponseBody
    public String results(@PathVariable int num) {
        int i = (int) (Math.random() * 6) + 1;
        if (i == num) {
            return "Lucky guess, you got it!";
        } else {
            return "Nope, give me your money!";
        }
    }

}
