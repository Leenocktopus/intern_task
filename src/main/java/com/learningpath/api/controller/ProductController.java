package com.learningpath.api.controller;

import com.learningpath.api.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    // TODO: Use dependency injection to inject ProductService instance in this class. (Note: Look at ProductService for reference)

    // TODO: Use ProductService injected object to get all existing products
    @GetMapping
    public List<Product> getAll(){
        return null;
    }

    //TODO: Use ProductService injected object to get product by id
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("{id}")
    public Product getById(@PathVariable("id") Integer id){
        return Product.builder().name("something").build();
    }

    //TODO: Use ProductService injected object to add new product
    @PostMapping
    public Product save(@RequestBody Product product){
        return null;
    }

    // TODO: Use ProductService injected object to update existing product
    @PutMapping("{id}")
    public Product update(/* TODO: Provide correct parameters for this method. (Note: Look at the previous 2 methods and ProductService update method for reference)*/){
        return null;
    }

    // TODO: Use ProductService injected object to delete product
    @DeleteMapping("{id}")
    public void delete(/* TODO: Capture 'id' path variable to pass it to the ProductService method*/){

    }
}
