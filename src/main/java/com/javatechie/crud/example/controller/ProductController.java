package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addPruduct (@RequestBody Product product){
        return service.savePruduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addPruduct (@RequestBody List<Product> product){
        return service.savePruducts(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getPruducts();

    }

    @GetMapping("/productById/{id}")
    public Product findProductById (@PathVariable int id){
        return service.getPruductsById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName (@PathVariable String name){
        return service.getPruductsByName(name);
    }


    @PutMapping("/update")
    public Product updateProduct (@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id){
        return service.deleteProduct(id);
    }

}
