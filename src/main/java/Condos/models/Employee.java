package Condos.models;


import org.springframework.http.ResponseEntity;

public class Employee {

    private int idM;
    private String nameM;
    private String usernameM;
    private String passwordM;


    public Employee(int idM, String nameM, String usernameM, String passwordM) {
        this.idM = idM;
        this.nameM = nameM;
        this.usernameM = usernameM;
        this.passwordM = passwordM;
    }

    public Employee(String nameM, String usernameM, String passwordM) {
        this.nameM = nameM;
        this.usernameM = usernameM;
        this.passwordM = passwordM;
    }

    public Employee(int idM, String usernameM, String passwordM) {
        this.idM = idM;
        this.usernameM = usernameM;
        this.passwordM = passwordM;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public Employee() {
        this.usernameM = "employee";
        this.passwordM = "12345";
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    public String getUsernameM() {
        return usernameM;
    }

    public void setUsernameM(String usernameM) {
        this.usernameM = usernameM;
    }

    public String getPasswordM() {
        return passwordM;
    }

    public void setPasswordM(String passwordM) {
        this.passwordM = passwordM;
    }

    public boolean check(String username, String password) {
        if (usernameM.equals(username) && passwordM.equals(password)) {
            return true;
        }
        return false;
    }

    public boolean checkUsername(String username) {
        if (usernameM.equals(username)) {
            return false;
        }
        return true;
    }
}
