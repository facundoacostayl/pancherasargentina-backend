package com.pancherasargentina.server.pancherasargentinaserver.mercadoPago.ModelEntity;

public class UserBuyer {
    private String title;
    private int quantity;
    private int unit_price;

    public UserBuyer(String title, int quantity, int unit_price) {
        this.title = title;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }
}
