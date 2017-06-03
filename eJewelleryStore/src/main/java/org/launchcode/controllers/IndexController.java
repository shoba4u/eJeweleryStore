package org.launchcode.controllers;


import org.launchcode.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shoba on 5/11/2017.
 */

@Controller
public class IndexController {

    @Autowired
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("products",productService.listProducts());
        return "index";
    }
}
