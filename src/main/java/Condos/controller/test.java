package Condos.controller;


import Condos.Config.ComponentConfig;
import Condos.services.POService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class test implements Initializable {
    private POService service;

//    @FXML
//    private Label test2;

    @FXML
    private Label address;
    @FXML public  void initialize(URL url, ResourceBundle resourceBundle)  {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        service = context.getBean(POService.class);
//        System.out.println(service.getAll());
//        test2.setText(service.getAll().get(0).getAddress_PO());
        address.setText(service.getAll().get(0).getAddress_PO());
        System.out.println(service.getAll().get(0).getAddress_PO());

    }
}
