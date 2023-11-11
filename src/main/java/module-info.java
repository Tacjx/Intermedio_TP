module com.example.intermedio_tp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intermedio_tp to javafx.fxml;
    exports com.example.intermedio_tp;
}