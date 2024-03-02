package com.pancherasargentina.server.pancherasargentinaserver.shippingLocation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ShippingLocationConfig {
    @Bean
    CommandLineRunner commandLineRunner(ShippingLocationRepository shippingLocationRepository) {
        return args -> {
            ShippingLocation CABA = new ShippingLocation("CABA",4000);
            ShippingLocation GBA = new ShippingLocation("GBA",4000);
            ShippingLocation BUENOSAIRES = new ShippingLocation("Buenos Aires Interior",7000);
            ShippingLocation INTERIOR = new ShippingLocation("Interior",10000);

            shippingLocationRepository.saveAll(List.of(CABA, GBA, BUENOSAIRES, INTERIOR));
        };
    }
}
