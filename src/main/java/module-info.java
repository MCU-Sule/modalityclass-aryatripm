module com.arya.tugas3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.arya.tugas3 to javafx.fxml;
    exports com.arya.tugas3;
    exports com.arya.tugas3.controller;
    exports com.arya.tugas3.model;
    opens com.arya.tugas3.controller to javafx.fxml;
}