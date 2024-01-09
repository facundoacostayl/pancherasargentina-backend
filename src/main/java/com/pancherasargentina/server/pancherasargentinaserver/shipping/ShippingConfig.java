package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ShippingConfig {
    @Bean
    CommandLineRunner commandLineRunner(ShippingRepository repository) {
        return args -> {
            Shipping facundoShipping = new Shipping(
                    "Facundo",
                    "facundo@facundo.com",
                    "1122334455",
                    "Correo",
                    "Siempre Viva 1234",
                    "2 ° A",
                    "GBA",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            repository.saveAll(List.of(facundoShipping));
        };
    }
}
