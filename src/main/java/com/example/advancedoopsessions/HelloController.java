package com.example.advancedoopsessions;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

import java.io.IOException;
public class HelloController extends HelpController {
    @FXML
    private Label welcomeText;
    @FXML
    void backToChat(MouseEvent event) throws IOException {
        switchScene("/fxml/chatController.fxml");
    }

    @FXML
    void backToMain(MouseEvent event) {
        switchScene("/fxml/main.fxml");
    }

    @FXML
    void intoCall(MouseEvent event) throws IOException {
        switchScene("/fxml/callController.fxml");
    }
    @FXML
    void intoChat(MouseEvent event) throws IOException {
        HelpController.switchScene("/fxml/chatController.fxml");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}