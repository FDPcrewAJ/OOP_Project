module com.dice_escape {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dice_escape to javafx.fxml;
    exports com.dice_escape;
}
