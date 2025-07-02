package org.example.menu;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void handleDivision(ActionEvent event) {
        DivisionVentana.show();
    }
}