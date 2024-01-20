package com.pancherasargentina.server.pancherasargentinaserver.shippingLocation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingLocationService {

    private final ShippingLocationRepository shippingLocationRepository;

    @Autowired
    public ShippingLocationService(ShippingLocationRepository shippingLocationRepository) {
        this.shippingLocationRepository = shippingLocationRepository;
    }

    public List<ShippingLocation>getShippingLocation() {
        return shippingLocationRepository.findAll();
    }
}
