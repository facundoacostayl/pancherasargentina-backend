package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api/v1/shipping")
public class ShippingController {

    private final ShippingService shippingService;
    @Autowired
    public ShippingController(ShippingService shippingservice){
        this.shippingService = shippingservice;
    }

    @GetMapping
    public List<Shipping>getShippings() {
        return shippingService.getShippings();
    }
}
