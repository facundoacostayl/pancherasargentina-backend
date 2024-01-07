package com.pancherasargentina.server.pancherasargentinaserver.shipping;

public class Shipping {
    private Long id;
    private String clientName;
    private String email;
    private String phone;
    private String shippingType;
    private String address;
    private String door;
    private String city;

    public Shipping(){};

    public Shipping(Long id, String clientName, String email, String phone, String shippingType, String address, String door, String city) {
        this.id = id;
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
        this.shippingType = shippingType;
        this.address = address;
        this.door = door;
        this.city = city;
    }

    public Shipping(String clientName, String email, String phone, String shippingType, String address, String door, String city) {
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
        this.shippingType = shippingType;
        this.address = address;
        this.door = door;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
                ", city='" + city + '\'' +
                '}';
    }
}
