package Condos.controller;

import Condos.models.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {
    @FXML
    private Label error;

    @FXML
    private Button loginButton,registerButton;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    private Employee employees;

    public void initialize(){
        employees = new Employee();

    }


    public void loginButtonOnAction(ActionEvent event) throws IOException {

        if (employees.check(username.getText(),password.getText())){
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("homeEmployee.fxml"));
            stage.setScene(new Scene(loader.load(),1080,680));

            stage.show();

        }
        else {
            username.clear();
            password.clear();
            error.setText("ข้อมูลไม่ถูกต้อง");
        }

    }

}
