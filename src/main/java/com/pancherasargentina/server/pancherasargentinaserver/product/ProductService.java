package com.pancherasargentina.server.pancherasargentinaserver.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return List.of(new Product(2L, "Panchera", "Para los mejores hot doggie doggs", 20000, "panchera"));
    }
}
