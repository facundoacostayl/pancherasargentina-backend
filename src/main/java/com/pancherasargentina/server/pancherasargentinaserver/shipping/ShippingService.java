package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class ShippingService {

    private final ShippingRepository shippingRepository;

    @Autowired
    public ShippingService(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;
    }

    public List<Shipping> getShippings() {
        return shippingRepository.findAll();
    }

    public Shipping addShipping(Shipping shipping) { return shippingRepository.save(shipping); }

    public Shipping updateShipping(long id, Shipping shipping) {
        Shipping shippingToUpdate = shippingRepository.findById(id).orElseThrow();

        shippingToUpdate.setClientName(shipping.getClientName());

        return shippingRepository.save(shippingToUpdate);

    }
}