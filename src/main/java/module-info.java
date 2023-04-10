module com.example.conveyers_model {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.conveyers_model to javafx.fxml;
    exports com.example.conveyers_model;
    exports com.example.conveyers_model.controller;
    opens com.example.conveyers_model.controller to javafx.fxml;
}