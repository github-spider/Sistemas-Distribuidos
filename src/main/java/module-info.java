module com.example.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    opens com.example.game to javafx.fxml;
    exports com.example.game;
}