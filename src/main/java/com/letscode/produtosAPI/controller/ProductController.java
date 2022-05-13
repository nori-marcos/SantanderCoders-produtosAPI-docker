package com.letscode.produtosAPI.controller;

import com.letscode.produtosAPI.model.Product;
import com.letscode.produtosAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product create(@RequestBody(required = true) Product request){
        return productService.create(request);
    }

    @GetMapping
    public List<Product> getAll(){
        return  productService.getAll();
    }

}


