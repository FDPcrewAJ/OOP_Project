module com.diceescape {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diceescape to javafx.fxml;
    exports com.diceescape;
}
