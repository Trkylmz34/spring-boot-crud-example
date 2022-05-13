package com.javatechie.crud.example.service;


import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public Product savePruduct (Product product){
        return repository.save(product);
    }

    public List<Product> savePruducts (List<Product> products){
        return repository.saveAll(products);
    }


    public List<Product> getPruducts (){
        return repository.findAll();
    }

    public Product getPruductsById (int id){
        return repository.findById(id).orElse(null);
    }

    public Product getPruductsByName (String name){
        return repository.findByName(name);
    }

    public String deleteProduct (int id){
        repository.deleteById( id);
        return "Product Removed !!"+id;
    }

    public Product updateProduct (Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(product);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}
