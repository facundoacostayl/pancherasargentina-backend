package com.pancherasargentina.server.pancherasargentinaserver.shippingLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shippingLocation")
public class shippingLocationController {

    private final ShippingLocationService shippingLocationService;

    @Autowired
    public shippingLocationController(ShippingLocationService shippingLocationService) {
        this.shippingLocationService = shippingLocationService;
    }

    @GetMapping
    public List<ShippingLocation> getShippingLocation() {
        return shippingLocationService.getShippingLocation();
    }
}
