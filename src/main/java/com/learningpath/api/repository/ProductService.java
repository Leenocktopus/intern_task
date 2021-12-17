package com.learningpath.api.repository;

import com.learningpath.api.model.Product;
import com.learningpath.api.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    // Dependency injection
    @Autowired
    ProductRepository productRepository;

    // TODO: Use productRepository method to get all existing products
    public List<Product> getAll(){
        return null;
    }

    // TODO: Use productRepository method to get product by id
    public Product getById(Integer id){
        return null;
    }

    // TODO: Use productRepository method to add new product
    public Product add(Product product){
        return null;
    }

    // TODO: Use productRepository method to update existing product
    public Product update(Integer id, Product product){
        return null;
    }

    // TODO: Use productRepository method responsible for deleting products
    public void delete(Integer id){

    }
}
