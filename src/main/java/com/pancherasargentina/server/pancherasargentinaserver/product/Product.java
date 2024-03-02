package com.pancherasargentina.server.pancherasargentinaserver.product;

import jakarta.persistence.*;

@Entity
@Table (name = "product")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    private String name;
    private String description;
    private Number price;
    private String productType;

    private String imageUrl;

    public Product(){};

    public Product(Long id, String name, String description, Number price, String productType, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productType = productType;
        this.imageUrl = imageUrl;
    }

    public Product(String name, String description, Number price, String productType, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productType = productType;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", productType='" + productType + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
