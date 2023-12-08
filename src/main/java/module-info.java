module com.example.chatapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advancedoopsessions to javafx.fxml;
    exports com.example.advancedoopsessions;
}