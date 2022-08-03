package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    public String viewAllPosts() {
        return "/posts/index";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    public String viewIndividualPosts(@PathVariable long id) {
        return "/posts/view";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    public String viewCreatePostForm() {
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String savePost() {
        return null;
    }
}
