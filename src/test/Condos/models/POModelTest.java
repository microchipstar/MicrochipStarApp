package Condos.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class POModelTest {
    private Product product;
    private POModel poModel;
    @BeforeEach
    void setPOModel(){
        poModel = new POModel();
        product = new Product();

        product.setId_P("16B");
        product.setName_P("16B-MCS-1");
        product.setQuantity_P(10000);
        product.setPrice_P(10);

        poModel.setName_PO("meuang");
        poModel.setQuantity_PO(1000);
        poModel.setPn_PO("16B");
        poModel.setPhone_PO("0649548866");
        poModel.setEmail_PO("user@gmail.com");
        poModel.setAddress_PO("12/xxx");

        int buyProduct = product.getQuantity_P() - poModel.getQuantity_PO();
        product.setQuantity_P(buyProduct);

    }

    @Test
    void check_Quantity_Product(){
        assertEquals(product.getQuantity_P(),9000);
    }
}