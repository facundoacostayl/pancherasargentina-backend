package com.pancherasargentina.server.pancherasargentinaserver.product;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {
    /*@Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product pancheraSuperior = new Product("Panchera Superior 22", "Increible panchera con todos los chiches. Para hacer pan de hamon y tamalitos. Simple y efectiva.", 20500, "panchera");
            Product pancheraInferior = new Product("Panchera Inferior 455", "Panchera medio pelo que no calienta ni el pan. Para hacer panchos en la estación y con suerte.", 10500, "panchera");
            Product carroSuperior = new Product("Carro Panchero Superior 22", "Increible carro panchero. Arriba los panchos.", 40400, "carro");
            Product carroInferior = new Product("Carro Panchero Inferior 455", "Carro panchero medio medio. Pasa por una piedrita y se desarma", 28400, "carro");

            productRepository.saveAll(List.of(pancheraSuperior, pancheraInferior, carroSuperior, carroInferior));
        };
    }*/
}
