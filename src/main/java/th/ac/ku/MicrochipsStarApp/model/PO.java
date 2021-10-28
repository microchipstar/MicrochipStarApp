package th.ac.ku.MicrochipsStarApp.model;

import java.util.UUID;

public class PO {

    private UUID ID_PO;
    private String name_PO;
    private String address_PO;
    private String email_PO;
    private String telephone_PO;
    private int quantity;
    private String productName_PO;

    public UUID getID_PO() {
        return ID_PO;
    }

    public void setID_PO(UUID ID_PO) {
        this.ID_PO = ID_PO;
    }

    public String getName_PO() {
        return name_PO;
    }

    public void setName_PO(String name_PO) {
        this.name_PO = name_PO;
    }

    public String getAddress_PO() {
        return address_PO;
    }

    public void setAddress_PO(String address_PO) {
        this.address_PO = address_PO;
    }

    public String getEmail_PO() {
        return email_PO;
    }

    public void setEmail_PO(String email_PO) {
        this.email_PO = email_PO;
    }

    public String getTelephone_PO() {
        return telephone_PO;
    }

    public void setTelephone_PO(String telephone_PO) {
        this.telephone_PO = telephone_PO;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName_PO() {
        return productName_PO;
    }

    public void setProductName_PO(String productName_PO) {
        this.productName_PO = productName_PO;
    }
}
