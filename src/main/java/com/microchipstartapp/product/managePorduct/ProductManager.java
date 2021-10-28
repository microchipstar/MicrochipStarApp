package com.microchipstartapp.product.managePorduct;



import com.microchipstartapp.product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> listOfProduct;
    public ProductManager(){
        this.listOfProduct = new ArrayList<>();
    }

    public int addProduct(Product p){
        this.listOfProduct.add(p);
        return count();
    }

    public int count(){
        return this.listOfProduct.size();
    }

    public Product getProduct(int index){
        if(index < 0 || index >= count()){
            return null;
        }
        return this.listOfProduct.get(index);
    }
    public boolean removeProduct(String id){
        int index = -1;
        for (int i = 0, n = count(); i<n; i++){
            if (this.listOfProduct.get(i).getId_P().equals(id)){
                index = i;
                break;
            }
        }
        if (index != -1){
            this.listOfProduct.remove(index);
            System.out.println("removed");
            return true;

        }
        else{
            System.out.println("not remove");
        }
        return false;
    }



}
