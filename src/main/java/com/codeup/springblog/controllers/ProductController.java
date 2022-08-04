package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductRepository productsDao;

    public ProductController(ProductRepository productsDao) {
        this.productsDao = productsDao;
    }

    @GetMapping("/products")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productsDao.findAll());

        List<Product> searchedProducts = productsDao.getProductByName("oil");
        for( Product product : searchedProducts) {
            System.out.println(product.getName());
        }
        // the .save() method accepts an object and will save to the DB!
        // productsDao.save(new Product(51, "New Balance Shoes", "$55.99"))
        return "products/index";
    }
}