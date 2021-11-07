package Condos.services;

import Condos.Config.ComponentConfig;
import Condos.models.POModel;
import Condos.models.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class POService {
    private POModel poModel;
    private APIService apiService;

    public POService() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        apiService = context.getBean(APIService.class);
    }

    public void buyProduce(String name, String phone, String email, String address, String pn, int quantity, float tp, String evidence, String date){
        poModel = new POModel(name, phone, email, address, pn, quantity, tp, evidence, date,"ยืนยันการสั่งซื้อ");
        apiService.addPO(poModel);
//        DatabaseConnection connectionNow = new DatabaseConnection();
//        Connection connectionDB = connectionNow.getConnection();
//
//        String insertFields = "INSERT INTO microchipapp.po (name_PO, phone_PO, email_PO, address_PO, pn_PO, quantity_PO, total_price_PO,evidence_PO,date_PO,status_PO) VALUES ('";
//        String insertValues = name + "','" + phone + "','" + email + "','" + address + "','" + pn + "','" + quantity+ "','" + tp + "','" + evidence+ "','" + date + "','" + "ยืนยันการสั่งซื้อ"+ "')";
//        String insertToRegister = insertFields + insertValues;
//
//        try {
//            Statement statement = connectionDB.createStatement();
//            statement.executeUpdate(insertToRegister);
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//            e.getCause();
//        }
    }
//
    public void changeStatus(int id,String status){
//        apiService.updatePO(id,status);
//        DatabaseConnection connectionNow = new DatabaseConnection();
//        Connection connectionDB = connectionNow.getConnection();
//
//
//        String insertFields = "UPDATE microchipapp.po SET status_PO = '" + status  + "'WHERE id_PO = '" + id + "'AND status_PO = '" + statusText + "'";
////        String insertValues = username + "','" + password + "','" + name + "','" + phone + "','" + address + "','" + "-" + "','" + 0 + "')";
////        String insertToRegister = insertFields + insertValues;
//        System.out.println(insertFields);
//
//
//
//        try {
//            Statement statement = connectionDB.createStatement();
//            statement.executeUpdate(insertFields);
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//            e.getCause();
//        }
    }
//
//
//    public void update(int priceDB,int quantity_PO,String id) {
//        DatabaseConnection connectionNow2 = new DatabaseConnection();
//        Connection connectDB2 = connectionNow2.getConnection();
//        int result = priceDB - quantity_PO;
////                        int result = quantityDB - poModel.getQuantity_PO();
////        String resultStr = String.valueOf(result);
////                        String updateField = "UPDATE microchipapp.product SET all_quantity_P = + '" + resultStr + "' WHERE id_P = '" + poModel.getPn_PO() + "'";
//        String updateField = "UPDATE microchipapp.product SET all_quantity_P = + '" + result + "' WHERE id_P = '" + id + "'";
////        String updateField = "UPDATE microchipapp.product SET all_quantity_P = + '" + editQuantity + "' WHERE id_P = '" + idProduct + "'";
//
//        try {
//            System.out.println("1");
//            Statement statement2 = connectDB2.createStatement();
//            statement2.executeUpdate(updateField);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
//    }
//
//
////    public void editQuantityButtonOnAction(ActionEvent event){
////        DatabaseConnection connectionNow = new DatabaseConnection();
////        Connection connectDB = connectionNow.getConnection();
////
////        String idProduct = selectedProduct.getId_P();
////        String editQuantity = editQuantity_Field.getText();
////        if (editQuantity_Field.getText().isEmpty()) {
////            editWarning.setText("Please fill in the Information.");
////        }
////        else {
////            if(productDetail.isInt(editQuantity_Field.getText())) {
////                if (Integer.parseInt(editQuantity_Field.getText()) >= 0 ) {
////                    String updateField = "UPDATE microchipapp.product SET all_quantity_P = + '" + editQuantity + "' WHERE id_P = '" + idProduct + "'";
////                    try {
////                        Statement statement = connectDB.createStatement();
////                        statement.executeUpdate(updateField);
////                        clearSelectedProduct();
////                        updateTable();
////                    } catch (Exception e) {
////                        e.printStackTrace();
////                        e.getCause();
////                    }
////                }
////                else{editWarning.setText("Please enter correct information.");}
////            }else {editWarning.setText("Please enter the numbers.");
////            }
////     }
//
////    }
//
    public boolean checkProduct(int quantity_PO , String namePro){
        for (Product p : apiService.getP()){
            if (quantity_PO < p.getQuantity_P()){
                    System.out.println("1");
                    return true;
                }
                else {
                    System.out.println("2");
                    return false;
                }
        }
        return false;
    }
//        DatabaseConnection connectionNow = new DatabaseConnection();
//        Connection connectionDB = connectionNow.getConnection();
//        String connectQuery = "SELECT all_quantity_P FROM microchipapp.product WHERE name_P = '" + namePro + "'";
//
//        try {
//            Statement statement = connectionDB.createStatement();
//            ResultSet queryOutPut = statement.executeQuery(connectQuery);
//            while (queryOutPut.next()){
//                if (quantity_PO<Integer.parseInt(queryOutPut.getString("all_quantity_P"))){
//                    System.out.println("1");
//                    return true;
//                }
//                else {
//                    System.out.println("2");
//                    return false;
//                }
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("4");
//        return false;
//    }
}
