package com.arya.tugas3.controller;

import com.arya.tugas3.Application;
import com.arya.tugas3.model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddController {
    public TextField nama;
    public TextField harga;
    public ChoiceBox<Float> discount;

    private Item newItem;
    private Stage customDiscModal;
    private Float customDiscount;

    public void initialize() {
        ObservableList<Float> discounts = FXCollections.observableArrayList();
        discount.setItems(discounts);
        discounts.addAll(0.f, 0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f);
        discount.getSelectionModel().selectFirst();

        customDiscModal = new Stage();
    }

    public void customDiscount(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("customDiscount.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 150);
        CustomDiscountController discountController = fxmlLoader.getController();

        customDiscModal.setTitle("Hello!");
        customDiscModal.setScene(scene);
        customDiscModal.showAndWait();

        customDiscount = discountController.getDiscount();
    }

    public void addMenu(ActionEvent actionEvent) {
        if (customDiscount != null) {
            newItem = new Item(nama.getText(), Integer.parseInt(harga.getText()), customDiscount);
        } else {
            newItem = new Item(nama.getText(), Integer.parseInt(harga.getText()), discount.getValue());
        }
        nama.getScene().getWindow().hide();
    }

    public Item getNewItem() {
        return newItem;
    }
}
