package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    public String viewAllPosts(Model model){
    List<Post> allPosts = new ArrayList<>();
        allPosts.add(new Post(1, "Number 1", "Using Spring"));
        allPosts.add(new Post(2, "Number 2", "Using Spring"));
        allPosts.add(new Post(3, "Number 3", "Using Spring"));
        allPosts.add(new Post(4, "Number 4", "Using Spring"));

        model.addAttribute("posts", allPosts);

        return "/posts/index";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    public String viewIndividualPosts(@PathVariable long id, Model model) {
        model.addAttribute("Trucks", new Post(5, "Ford Trucks", "New details"));
        return "/posts/show";
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
