package Condos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    Button MasterAdminButton,AdminButton,AdministratorInformationButton;



    @FXML public void handleMasterAdminButtonOnAction(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Admin/LoginMaster.fxml"));
        stage.setScene(new Scene(loader.load(),800,600));


        stage.show();

    }

    @FXML public void handleAdministratorInformationButtonOnAction(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Post/ProfileController.fxml"));
        stage.setScene(new Scene(loader.load(),800,600));



        stage.show();

    }

    @FXML public void handleAdminButtonOnAction(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/test.fxml"));
        stage.setScene(new Scene(loader.load(),800,600));



        stage.show();

    }
}
