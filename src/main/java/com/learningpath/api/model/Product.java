package com.learningpath.api.model;

import java.math.BigDecimal;

// TODO - After all other tasks. Import Lombok dependency using build.gradle file and Lombok plugin in Intellij Idea. Look at the @AllArgsConstructor, @Getter, @Setter and @Builder annotations and try to replace boilerplate code in this class
public class Product {
    private Integer id;
    private String name;
    private String manufacturer;
    private String category;
    private BigDecimal price;
    private String description;

    public Product(Integer id, String name, String manufacturer, String category, BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    /*
    * Example of builder pattern. This pattern helps us to conveniently create objects, especially when we need to set
    * only part of the fields during instantiation. Another benefit of this pattern is that we isolate complex object construction
    * in the separate class. Finally, there is a benefit in creating new object instead of changing fields of existing object.
    */
    public static class ProductBuilder{
        private Integer id;
        private String name;
        private String manufacturer;
        private BigDecimal price;
        private String description;
        private String category;

        public ProductBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }

        public ProductBuilder manufacturer(String manufacturer){
            this.manufacturer = manufacturer;
            return this;
        }

        public ProductBuilder category(String category){
            this.category = category;
            return this;
        }

        public ProductBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        public ProductBuilder description(String description){
            this.description = description;
            return this;
        }

        public Product build(){
            return new Product(id, name, manufacturer, category, price, description);
        }
    }
}
