package Condos.controller;

import Condos.Config.ComponentConfig;
import Condos.models.Employee;
import Condos.models.POModel;
import Condos.services.APIService;
import Condos.services.DataListSourceBox;
import Condos.services.EmployeeList;
import Condos.services.EmployeeService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class homeEmployeeController implements Initializable {
//    public class homeEmployeeController {
    @FXML
    private Button addEmployee,confirmState;

    @FXML
    private TextField serach;

    @FXML
    private TableView<POModel> POTable,testTable,table;

    @FXML
    private TableColumn<POModel, Integer> id_po,quantity,tp;

    @FXML private TableColumn<POModel, String> name,pn,phone,address,status,date;

    @FXML private Label error,test,nameTestText,addressTest,phoneText,dateText,statesText;

    @FXML private ChoiceBox<String> choiceBoxState;

    private String[] state = {"กำลังผลิต", "กำลังจัดส่ง","ส่งสินค้าแล้ว"};

    //    private PO selectedPO;
    private POModel poModel;
//    private user selectedUser;

    private ObservableList<POModel> dataObservableList;
    private DataListSourceBox dataSource;
    private EmployeeService employeeService;
    private EmployeeList BoxLists;
    private Employee employee;
    private APIService apiService;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        choiceBoxState.getItems().addAll(state);
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        apiService = context.getBean(APIService.class);
        updateTable();
//        System.out.println(apiService.getAll().get(0).getName_PO());
//        employee = new Employee("meuang","admin1","12345");
//        BoxLists = dataSource.getDatazz();
//        showData();
//        BoxLists.addItem(employee);
//        System.out.println(BoxLists);
//        System.out.println(employee.getUsernameM());
//        BoxLists.addItem(employee);
//        BoxLists = dataSource.getDatazz();
//        System.out.println(BoxLists.toList());
//        BoxLists = (EmployeeList) employeeService.getE();
//        updateTable();
//        showData();

    }

//    private void showData() {
//        dataObservableList.addAll(employee);
//        dataObservableList = FXCollections.observableArrayList(BoxLists.toList());
//        table.setItems(dataObservableList);
//
//        ArrayList<StringConfiguration> configs = new ArrayList<>();
//        configs.add(new StringConfiguration("title:id", "field:idM"));
//        configs.add(new StringConfiguration("title:ผู้ส่ง", "field:senderName"));
//        configs.add(new StringConfiguration("title:ผู้รับ", "field:recipientName"));
//        configs.add(new StringConfiguration("title:ห้องผู้รับ", "field:RecipientRoomNo"));
//        configs.add(new StringConfiguration("title:ประเภท", "field:type"));
//        configs.add(new StringConfiguration("title:ความสำคัญ", "field:importance"));
//        configs.add(new StringConfiguration("title:ขนาด", "field:size"));
//        configs.add(new StringConfiguration("title:บริษัติ", "field:company"));
//        configs.add(new StringConfiguration("title:TrackingNumber", "field:trackingNumber"));
//        configs.add(new StringConfiguration("title:วัน/เดือน/ปี", "field:date"));
//        configs.add(new StringConfiguration("title:เวลา", "field:time"));

//        for (StringConfiguration conf: configs) {
//            TableColumn col = new TableColumn(conf.get("title"));
//            col.setCellValueFactory(new PropertyValueFactory<>(conf.get("field")));
//            table.getColumns().add(col);
//        }
//    }
//
//
//
    public void updateTable(){
        error.setText("");
        ObservableList<POModel> poModelObservableList = FXCollections.observableArrayList();
        poModel = new POModel();
        nameTestText.setText("");
        addressTest.setText("");
        phoneText.setText("");
        dateText.setText("");
        statesText.setText("");
        choiceBoxState.setValue("กำลังผลิต");

//        for (POModel p: apiService.getAll()) {
//                Integer queryPOID = p.getId_PO();
//                String queryPOName = p.getName_PO();
//                String queryPOPN = p.getPn_PO();
//                Integer queryPOQuantity = p.getQuantity_PO();
//                float queryPOTP = p.getTotal_price_PO();
//                String queryPOPhone = p.getPhone_PO();
//                String queryPOAddress = p.getAddress_PO();
//                String queryPODate = p.getDate_PO();
//                String queryPOStatus = p.getStatus_PO();
//                String queryPOEmail = p.getEmail_PO();
//                String queryPOEvidence = p.getEvidence_PO();
//
//                poModelObservableList.add(new POModel(queryPOID,queryPOName,queryPOPhone,queryPOEmail,queryPOAddress,queryPOPN,queryPOQuantity,queryPOTP,queryPOEvidence,queryPODate,queryPOStatus));
//        }


//        DatabaseConnection connectNow = new DatabaseConnection();
//        Connection connectDB = connectNow.getConnection();
//
//        String productViewQuery = "SELECT * FROM microchipapp.po";
//
        try {

            for (POModel p: apiService.getAll()) {
                Integer queryPOID = p.getId_PO();
                String queryPOName = p.getName_PO();
                String queryPOPN = p.getPn_PO();
                Integer queryPOQuantity = p.getQuantity_PO();
                float queryPOTP = p.getTotal_price_PO();
                String queryPOPhone = p.getPhone_PO();
                String queryPOAddress = p.getAddress_PO();
                String queryPODate = p.getDate_PO();
                String queryPOStatus = p.getStatus_PO();
                String queryPOEmail = p.getEmail_PO();
                String queryPOEvidence = p.getEvidence_PO();

                poModelObservableList.add(new POModel(queryPOID,queryPOName,queryPOPhone,queryPOEmail,queryPOAddress,queryPOPN,queryPOQuantity,queryPOTP,queryPOEvidence,queryPODate,queryPOStatus));
            }

//            Statement statement = connectDB.createStatement();
//            ResultSet queryOutPut = statement.executeQuery(productViewQuery);
//
//
//            while (queryOutPut.next()){
//
//                Integer queryPOID = queryOutPut.getInt("id_PO");
//                String queryPOName = queryOutPut.getString("name_PO");
//                String queryPOPN = queryOutPut.getString("pn_PO");
//                Integer queryPOQuantity = queryOutPut.getInt("quantity_PO");
//                float queryPOTP = queryOutPut.getFloat("total_price_PO");
//                String queryPOPhone = queryOutPut.getString("phone_PO");
//                String queryPOAddress = queryOutPut.getString("address_PO");
//                String queryPODate = queryOutPut.getString("date_PO");
//                String queryPOStatus = queryOutPut.getString("status_PO");
//                String queryPOEmail = queryOutPut.getString("email_PO");
//                String queryPOEvidence = queryOutPut.getString("evidence_PO");

                //poModelObservableList.add(new POModel(queryPOID,queryPOName,queryPOPhone,queryPOEmail,queryPOAddress,queryPOPN,queryPOQuantity,queryPOTP,queryPOEvidence,queryPODate,queryPOStatus));
//                System.out.println(queryOutPut.getString("status_PO"));

            }catch (IllegalArgumentException e){
            e.getStackTrace();
        }



            id_po.setCellValueFactory(new PropertyValueFactory<>("id_PO"));
            name.setCellValueFactory(new PropertyValueFactory<>("name_PO"));
            phone.setCellValueFactory(new PropertyValueFactory<>("phone_PO"));
            address.setCellValueFactory(new PropertyValueFactory<>("address_PO"));
            pn.setCellValueFactory(new PropertyValueFactory<>("pn_PO"));
            quantity.setCellValueFactory(new PropertyValueFactory<>("quantity_PO"));
            tp.setCellValueFactory(new PropertyValueFactory<>("total_price_PO"));
            date.setCellValueFactory(new PropertyValueFactory<>("date_PO"));
            status.setCellValueFactory(new PropertyValueFactory<>("status_PO"));

            POTable.setItems(poModelObservableList);

            POTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null) {
                    showSelectedMemberCard(newValue);
                }
            });
//
//            FilteredList<POModel> filteredData = new FilteredList<>(poModelObservableList, b -> true);
//
//            serach.textProperty().addListener((observable, oldValue, newValue) ->{
//                filteredData.setPredicate(poModel -> {
//
//                    if (newValue.isEmpty() || newValue.isBlank() || newValue == null){
//                        return true;
//                    }
//
//                    String searchKeyword = newValue.toLowerCase();
//
//                    if (poModel.getDate_PO().toLowerCase().indexOf(searchKeyword) > -1){
//                        return true;
//                    }
////
//                    else if (poModel.getPn_PO().toLowerCase().indexOf(searchKeyword) > -1){
//                        return true;
//                    } else if (poModel.getStatus_PO().indexOf(searchKeyword) > -1
//
//                    ) {
//                        return true;
//                    }
////
//                    else {
//                        return false;
//                    }
//
//                });
//            });


//            SortedList<POModel> sortedData = new SortedList<>(filteredData);
//            sortedData.comparatorProperty().bind(POTable.comparatorProperty());
//
//            POTable.setItems(sortedData);

//        }catch (SQLException e){
//            Logger.getLogger(homeEmployeeController.class.getName()).log(Level.SEVERE,null,e);
//            e.printStackTrace();
//        }

    }
//
////    public void clearSelectedProduct(){
////        POTable.refresh();
////        POTable.getSelectionModel().clearSelection();
////    }
//
    private void showSelectedMemberCard(POModel card) {
//        selectedPO = card;
        error.setText("");
        nameTestText.setText(card.getName_PO());
        addressTest.setText(card.getAddress_PO());
        phoneText.setText(card.getPhone_PO());

        dateText.setText(card.getDate_PO());
        statesText.setText(card.getStatus_PO());
//        System.out.println(card.getId_PO());
//        System.out.println(card.getStatus_PO());
        if (card.getStatus_PO().equals("ส่งสินค้าแล้ว")){
            choiceBoxState.setDisable(true);
            confirmState.setDisable(true);
        }else {
            choiceBoxState.setDisable(false);
            confirmState.setDisable(false);
        }
//        confirmState.setOnAction(e -> getChoices(choiceBoxState,card.getId_PO(),card.getStatus_PO()));



//        cpLabel.setText(String.format("%.2f", card.getCumulativePurchase()));
//        ptLabel.setText(String.valueOf(card.getStamp()));
//        userImageView.setImage(new Image("file:"+selectedMemberCard.getImagePath(), true));
//        updateInfoButton.setDisable(false);
//        browseButton.setDisable(false);
    }
//
//    public void getChoice(ChoiceBox<String> choiceBox,int id,String statusText){
//
//        String po = poModel.getStatus_PO();
//        String status = choiceBox.getValue();
////         {"กำลังผลิต", "กำลังจัดส่ง","ส่งสินค้าแล้ว"}
//        if (statusText.equals("ยืนยันการสั่งซื้อ")){
//            if (status.equals("กำลังจัดส่ง") || status.equals("ส่งสินค้าแล้ว")){
//                error.setText("ไม่สามารถเปลี่ยน");
//                System.out.println("1");
//            }else {
//                ///  กำลังผลิต   ///
//                System.out.println("2");
//                poModel.changeStatus(id,status,statusText);
//                updateTable();
//            }
//        }else if (statusText.equals("กำลังจัดส่ง")){
//            if (status.equals("กำลังผลิต")){
//                System.out.println("3");
//                error.setText("ไม่สามารถเปลี่ยน");
//            }else {
//                //////
//                System.out.println("4");
//                poModel.changeStatus(id,status,statusText);
//                updateTable();
//            }
//        }
////        else if (statusText.equals("ยังไม่ชำระสินค้า")){
////            error.setText("ไม่สามารถเปลี่ยนได้");
////        }
//        else {
//            //กำลังจัดส่ง///
//            System.out.println("5");
//            updateTable();
//            poModel.changeStatus(id,status,statusText);
//        }
//
//
//
//
//
//        public void getChoices(ChoiceBox<String> choiceBox,int id,String statusText){
//            String po = poModel.getStatus_PO();
//        String status = choiceBox.getValue();
////         {"กำลังผลิต", "กำลังจัดส่ง","ส่งสินค้าแล้ว"}
//
//
//            //        {"ยืนยันการสั่งซื้อ","กำลังผลิต", "กำลังจัดส่ง","ส่งสินค้าแล้ว"}
//        if (statusText.equals("ยืนยันการสั่งซื้อ")){
//            if (status.equals("กำลังจัดส่ง") || status.equals("ส่งสินค้าแล้ว")){
//                error.setText("สถานนะไม่ถูกต้อง");
////                System.out.println("1");
//            }else {
//                ///  กำลังผลิต   ///
////                System.out.println("2");
//                apiService.updatePO(id,status);
////                poModel.changeStatus(id,status,statusText);
//                updateTable();
//            }
//        }
//        else if (statusText.equals("กำลังจัดส่ง")){
//            if (status.equals("กำลังผลิต")){
////                System.out.println("3");
//                error.setText("สถานนะไม่ถูกต้อง");
//            }else {
//                ///ส่งสินค้าแล้ว///
////                System.out.println("4");
////                poModel.changeStatus(id,status,statusText);
//                apiService.updatePO(id,status);
//                updateTable();
//            }
//        }
////        else if (statusText.equals("ยังไม่ชำระสินค้า")){
////            error.setText("ไม่สามารถเปลี่ยนได้");
////        }
//        else if(statusText.equals("กำลังผลิต")){
//
//            if (status.equals("ส่งสินค้าแล้ว")){
//                error.setText("สถานนะไม่ถูกต้อง");
//            }
//            else{
//                //กำลังจัดส่ง///
////            System.out.println("5");
////                poModel.changeStatus(id,status,statusText);
//                apiService.updatePO(id,status);
//                updateTable();
//            }
//
//
//        }
//        }
////    @FXML
////    public void refreshButtonOnAction(ActionEvent event) throws IOException {
////        Button b = (Button) event.getSource();
////        Stage stage = (Stage) b.getScene().getWindow();
////
////        FXMLLoader loader = new FXMLLoader(getClass().getResource("homeEmployee.fxml"));
////        stage.setScene(new Scene(loader.load(),1080,680));
////
////        stage.show();
////    }
    @FXML
    public void goPOButton(ActionEvent event) throws IOException{
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/datasqltest/POpage.fxml"));
        stage.setScene(new Scene(loader.load(),1080,600));

        stage.show();
    }
//
    @FXML
    public void addProductButtonOnAction(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/datasqltest/product-view.fxml"));
        stage.setScene(new Scene(loader.load(),1080,680));

        stage.show();
    }
//
    @FXML
    public void addEmployeeButtonOnAction() {
        createAccountForm();
    }

    public void createAccountForm(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/datasqltest/registerEmployee.fxml"));
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,650,650));
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.show();

        }catch (Exception e){
            e.printStackTrace();;
            e.getCause();
        }
    }
    public void logOutButtonOnAction(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/datasqltest/login.fxml"));
        stage.setScene(new Scene(loader.load(), 800, 600));

        stage.show();

    }
}
