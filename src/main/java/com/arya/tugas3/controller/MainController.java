package com.arya.tugas3.controller;

import com.arya.tugas3.Application;
import com.arya.tugas3.model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    public ListView<Item> listMenu;
    public Button btnAdd;

    private ObservableList<Item> menu;
    private Stage addModal;

    public void initialize() {
        menu = FXCollections.observableArrayList();
        listMenu.setItems(menu);
        menu.add(new Item("Kopi", 2000, 0.f));
        menu.add(new Item("Kopi 2", 2000, 0.5f));

        addModal = new Stage();
    }

    public void addMenu(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("addModal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        AddController addController = fxmlLoader.getController();

        addModal.setTitle("Hello!");
        addModal.setScene(scene);
        addModal.showAndWait();

        if (addController.getNewItem() != null) {
            menu.add(addController.getNewItem());
        }
    }
}