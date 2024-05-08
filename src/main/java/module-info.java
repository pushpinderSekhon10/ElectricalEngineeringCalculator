module se2203.semiconductorprog {
    requires javafx.controls;
    requires javafx.fxml;


    opens se2203.semiconductorprog to javafx.fxml;
    exports se2203.semiconductorprog;
}