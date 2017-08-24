package com.keessi.desktop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LoginController {
    @FXML
    private Text actionTarget;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actionTarget.setText("Sign in button pressed");
    }

    @FXML
    protected void handleRegisterButtonAction(ActionEvent event) {
        actionTarget.setText("Register button pressed");
    }
}
