package th.ac.ku.MicrochipsStarApp.API.service.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class employee {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID ID_E;

    private String Username_E;
    private String Password_E;
    private String email_E;
    private String Name_E;


    public UUID getID_E() {
        return ID_E;
    }

    public void setID_E(UUID ID_E) {
        this.ID_E = ID_E;
    }

    public String getUsername_E() {
        return Username_E;
    }

    public void setUsername_E(String username_E) {
        Username_E = username_E;
    }

    public String getPassword_E() {
        return Password_E;
    }

    public void setPassword_E(String password_E) {
        Password_E = password_E;
    }

    public String getEmail_E() {
        return email_E;
    }

    public void setEmail_E(String email_E) {
        this.email_E = email_E;
    }

    public String getName_E() {
        return Name_E;
    }

    public void setName_E(String name_E) {
        Name_E = name_E;
    }

}
