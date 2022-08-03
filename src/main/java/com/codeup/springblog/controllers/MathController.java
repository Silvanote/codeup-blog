package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
@RequestMapping(path="/add/{n1}/and/{n2}", method = RequestMethod.GET)
@ResponseBody
public String add(@PathVariable int n1, @PathVariable int n2){
    return String.format("%d + %d = %d", n1, n2, n1+n2);
}

    @RequestMapping(path="/subtract/{n1}/from/{n2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int n1, @PathVariable int n2) {
        return String.format("%d + %d = %d", n1, n2, n1 - n2);
    }
    @RequestMapping(path="/multiply/{n1}/from/{n2}", method = RequestMethod.GET)
    @ResponseBody
        public String multiply(@PathVariable int n1, @PathVariable int n2) {
        return String.format("%d * %d = %d", n1, n2, n1 - n2);
    }
    @RequestMapping(path="/divide/{n1}/from/{n2}", method = RequestMethod.GET)
    @ResponseBody
            public String divide(@PathVariable int n1, @PathVariable int n2) {
        return String.format("%d / %d = %d", n1, n2, n1 - n2);
    }
}
