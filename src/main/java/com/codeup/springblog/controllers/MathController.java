package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/3/and/4")
    @ResponseBody
    public String reportNumber(@PathVariable int num) {
        String add = String.format("Here are some truths of the number %d.", num);
        String subtract = String.format("The number %d is even: %b.", num, num % 2 == 0., num);
        String multiply = String.format("The number %d is squared: %d.", num, (int) (Math.pow(num, 2)));
        String divide = String.format("The number %d is even: %b.", num, num % 2 == 0., num);
        return String.format("<h3>%s</h3>" +
                add, subtract, multiply, divide);
    }

    @GetMapping("/subtract/3/from/10")
    @ResponseBody
    public String subtract() {
        return "<h1>Hello from Spring!</h1>";
    }

    @GetMapping("/multiply/4/and/5")
    @ResponseBody
    public String multiply() {
        return "<h1>Hello from Spring!</h1>";
    }

    @GetMapping("/divide/6/by/3")
    @ResponseBody
    public String divide() {
        return "<h1>Hello from Spring!</h1>";
    }
}