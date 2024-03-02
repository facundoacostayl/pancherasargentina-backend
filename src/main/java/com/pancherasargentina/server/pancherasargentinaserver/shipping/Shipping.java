package com.pancherasargentina.server.pancherasargentinaserver.shipping;

import jakarta.persistence.*;

@Entity
@Table(name = "shipping")
public class Shipping {
    @Id
    @SequenceGenerator(
            name = "shipping_sequence",
            sequenceName = "shipping_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "shipping_sequence"
    )
    private Long id;
    private String clientName;
    private String email;
    private String phone;
    private String shippingType;
    private String address;
    private String door;
    private String shippingLocationId;

    public Shipping(){};

    public Shipping(Long id, String clientName, String email, String phone, String shippingType, String address, String door, String shippingLocationId) {
        this.id = id;
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
        this.shippingType = shippingType;
        this.address = address;
        this.door = door;
        this.shippingLocationId = shippingLocationId;
    }

    public Shipping(String clientName, String email, String phone, String shippingType, String address, String door, String shippingLocationId) {
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
        this.shippingType = shippingType;
        this.address = address;
        this.door = door;
        this.shippingLocationId = shippingLocationId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getShippingLocationId() {
        return shippingLocationId;
    }

    public void setShippingLocationId(String shippingLocationId) {
        this.shippingLocationId = shippingLocationId;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", shippingType='" + shippingType + '\'' +
                ", address='" + address + '\'' +
                ", door='" + door + '\'' +
                ", shippingLocationId='" + shippingLocationId + '\'' +
                '}';
    }
}
