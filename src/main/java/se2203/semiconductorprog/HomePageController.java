package se2203.semiconductorprog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController
{
    @FXML
    public Button scb;

    public void OpenQC(ActionEvent actionEvent) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(QuantumSolverApplication.class.getResource("quantumSolver-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = (Stage) scb.getScene().getWindow();
        stage.setTitle("Home Page");
        stage.setScene(scene);
        stage.show();
    }

    public void OpenSC(ActionEvent actionEvent) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(QuantumSolverApplication.class.getResource("mainWindow-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = (Stage) scb.getScene().getWindow();
        stage.setTitle("Home Page");
        stage.setScene(scene);
        stage.show();
    }
}
