package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ShippingService {
    public List<Shipping> getShippings() {
        return List.of(new Shipping(
                1L,
                "Facundo",
                "facundo@facundo.com",
                "1122334455",
                "Correo",
                "Siempre Viva 1234",
                "2 ° A",
                "GBA",
                LocalDate.of(2000, Month.JANUARY, 5)
        ));
    }
}
