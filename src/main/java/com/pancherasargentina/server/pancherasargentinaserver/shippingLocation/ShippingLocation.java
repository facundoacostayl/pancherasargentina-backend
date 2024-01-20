package com.pancherasargentina.server.pancherasargentinaserver.shippingLocation;

import jakarta.persistence.*;

@Entity
@Table (name = "shippingLocation")
public class ShippingLocation {
    @Id
    @SequenceGenerator(name="shippingLocation_sequence", sequenceName = "shippingLocation_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shippingLocation_sequence")
    private Long id;
    private String locationName;
    private Integer shippingPrice;

    public ShippingLocation(){}

    public ShippingLocation(Long id, String locationName, Integer shippingPrice) {
        this.id = id;
        this.locationName = locationName;
        this.shippingPrice = shippingPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Integer shippingPrice) {
        this.shippingPrice = shippingPrice;
    }
}