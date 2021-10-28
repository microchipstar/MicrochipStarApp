//package com.microchipstartapp.product.productController;
//
//import com.microchipstartapp.product.managePorduct.ProductManager;
//import com.microchipstartapp.product.model.Product;
//
//
//import java.util.Scanner;
//
//public class ProductControllerConsole {
//
//    private ProductManager pm;
//    private Scanner sc;
//
//    public ProductControllerConsole() {
//        this.sc = new Scanner(System.in);
//        this.pm = new ProductManager();
//    }
//
//    private int menu(){
//        System.out.println("--Menu--");
//        System.out.println("1. add product");
//        System.out.println("2. remove product");
//        System.out.println("3. show all product");
//        System.out.println("0. exit");
//        int choice = readInt(1, 3);
//        return choice;
//    }
//    public void start(){
//        while(true){
//            int choice = menu();
//            switch ( choice){
//                case 0:
//                    System.exit(0);
//                    break;
//                case 1:
//                    addProduct();
//                    break;
//                case 2:
//                    removeProduct();
//                    break;
//                case 3:
//                    showAll();
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//
//
//
//        }
//
//
//
//
//    }
//
//    private void removeProduct() {
//        System.out.println("enter id of product");
//        String id = sc.nextLine();
//        boolean result = this.pm.removeProduct(id);
//        if (result){
//            System.out.println("product was removed");
//        }
//        else{
//            System.out.println("Product not found");
//        }
//    }
//
//    private void showAll() {
//        System.out.println("--All product--");
//        System.out.println("ID\tName\tPrice\tQuantity_P\tImage");
//        for (int i = 0; i < this.pm.count(); i++){
//            Product p = this.pm.getProduct(i);
//            System.out.println(p.getId_P()+"\t"+p.getName_P()+"\t"+p.getPrice_P()+"\t"+p.getQuantity_P()+"\t"+p.getImage_P());
//        }
//    }
//
//    private void addProduct() {
//        System.out.println("enter product id: ");
//        String id = sc.nextLine();
//        System.out.println("enter product name: ");
//        String name = sc.nextLine();
//        System.out.println("enter product price: ");
//        float price = readFloat(0, Float.MAX_VALUE);
//        System.out.println("enter product quantity: ");
//        int quantity = readInt(0, Integer.MAX_VALUE);
//        System.out.println("enter product image: ");
//        String image = sc.nextLine();
//        Product p = new Product(id, name, price,quantity,image);
//        this.pm.addProduct(p);
//
//    }
//
//    private float readFloat(int min, float max) {
//        float price;
//        while (true){
//            try{
//                price = Float.parseFloat(sc.nextLine());
//                if(price >= min && price <= max){
//                    break;
//                }
//            }catch (Exception e){
//                System.out.println("invalid value. Try to enter a float value");
//            }
//        }
//        return price;
//    }
//
//    private int readInt(int min, int max) {
//        int choice;
//        while (true){
//            try{
//                choice = Integer.parseInt(sc.nextLine());
//                if (choice >= min && choice <= max){
//                    break;
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//        return choice;
//    }
//}
