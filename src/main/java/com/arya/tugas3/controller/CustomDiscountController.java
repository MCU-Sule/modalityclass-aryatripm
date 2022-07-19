package com.arya.tugas3.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CustomDiscountController {
    public TextField customDiscount;

    private Float discount;

    public void addCustomDiscount(ActionEvent actionEvent) {
        setDiscount(Float.parseFloat(customDiscount.getText()));
        customDiscount.getScene().getWindow().hide();
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getDiscount() {
        return discount;
    }
}
