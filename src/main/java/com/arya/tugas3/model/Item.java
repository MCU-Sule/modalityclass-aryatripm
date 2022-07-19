package com.arya.tugas3.model;

public class Item {
    private String name;
    private Integer price;
    private Float discount;

    public Item(String name, Integer price, Float discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        if (this.discount == 0.f) {
            return this.name + " " + this.price;
        } else {
            return this.name + " " + this.price * discount +
                    " (original price : " + this.price + ") Discount : " +
                    this.discount + "%";
        }
    }
}
