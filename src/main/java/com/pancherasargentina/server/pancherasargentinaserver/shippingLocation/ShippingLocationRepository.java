package com.pancherasargentina.server.pancherasargentinaserver.shippingLocation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingLocationRepository extends JpaRepository<ShippingLocation, Long> {
}
