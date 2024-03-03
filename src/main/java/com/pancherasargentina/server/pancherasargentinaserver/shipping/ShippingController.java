package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Shipping addShipping(@RequestBody Shipping shipping) {
        return shippingService.addShipping(shipping);
    }

    @PutMapping("{id}")
    public Shipping updateShipping(@PathVariable long id, @RequestBody Shipping shipping) {
        return shippingService.updateShipping(id, shipping);
    }
}
