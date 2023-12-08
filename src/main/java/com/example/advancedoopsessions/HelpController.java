package com.example.advancedoopsessions;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
public class HelpController {
    public static void switchScene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelpController.class.getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            HelloApplication.stageMain.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
