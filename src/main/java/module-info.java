module com.example.ruhmatooii {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ruhmatooii to javafx.fxml;
    exports com.example.ruhmatooii;
}