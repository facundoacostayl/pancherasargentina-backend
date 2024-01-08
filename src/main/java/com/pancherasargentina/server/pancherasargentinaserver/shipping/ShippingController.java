package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/shipping")
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
