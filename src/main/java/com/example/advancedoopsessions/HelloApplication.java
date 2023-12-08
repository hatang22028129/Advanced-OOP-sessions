package com.example.advancedoopsessions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage stageMain;
    @Override
    public void start(Stage stage) throws IOException {
        stageMain = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fxml/mainController.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stageMain.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}