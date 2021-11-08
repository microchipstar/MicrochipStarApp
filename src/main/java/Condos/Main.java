package Condos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/ui/startPage.fxml"));
        primaryStage.setTitle("Condo of happiness");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public void goToLoginOnAction(ActionEvent event)throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/login.fxml"));
        stage.setScene(new Scene(loader.load(), 800, 600));
        stage.setTitle("MicrochipStarApp!");
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
