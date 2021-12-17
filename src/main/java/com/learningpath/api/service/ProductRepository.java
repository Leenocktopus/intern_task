package com.learningpath.api.service;

import com.learningpath.api.model.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    /*
    * List of products plays a role of database here, Repository layer of the
    * typical Spring application is usually responsible for communication with
    * datasources such as database
    * */
    List<Product> products;

    public ProductRepository(){
        products = new ArrayList<>();

        // New product created using constructor
        products.add(new Product(1, "IPhone 12", "Apple", "Smartphones", BigDecimal.valueOf(799), "Lorem ipsum dolor..."));

        // New products created using Builder pattern
        products.add(Product.builder()
                .id(2)
                .name("Z Flip 3")
                .price(BigDecimal.valueOf(999))
                .description("Lorem ipsum dolor...")
                .manufacturer("Samsung")
                .category("Smartphones")
                .build());
        products.add(Product.builder()
                .id(3)
                .name("3200 Series Fully Automatic Espresso Machine")
                .manufacturer("Phillips")
                .category("Coffe machines")
                .price(BigDecimal.valueOf(599))
                .description("Lorem ipsum dolor...")
                .build());
    }

    // TODO: This method should return a list of all products
    public List<Product> getAll(){
        return null;
    }

    // TODO: This method should return a product by id
    public Product getById(Integer id){
        return null;
    }

    // TODO: This method should add new product to existing products and return new product (Note: Each product should have unique id)
    public Product add(Product product){
        return null;
    }

    // TODO: This method should update existing product using provided id to identify the product that should be updated and product object. This method also should return updated product
    public Product update(Integer id, Product product){
        return null;
    }

    // TODO: This method should delete existin product
    public void delete(Integer id){

    }

}
