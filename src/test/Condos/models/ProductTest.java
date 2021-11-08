package Condos.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setProduct(){
        product = new Product();
        product.setId_P("16B");
        product.setName_P("16B-MCH2");
        product.setQuantity_P(10000);
        product.setPrice_P(20);
    }
    @Test
    void check_buy_Product_Quantity(){
        int buyProduct = product.getQuantity_P() - 1000;
        product.setQuantity_P(buyProduct);
        assertEquals(product.getQuantity_P(),9000);
    }

    @Test
    void check_buy_Product_Price(){
        float price = 0;
        if (product.getName_P().equals("16B")){
            price = product.getPrice_P() * 100;
            assertEquals(price,20000);
        }
    }

    @Test
    void add_Product_Quantity(){
        int quantityProduct = 1000;
        product.setQuantity_P(product.getQuantity_P() + quantityProduct);
        assertEquals(product.getQuantity_P(),11000);
    }


}