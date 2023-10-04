package Shopp;

import java.util.Date;

public class Customer {

    private final String clientCode;
    private final Date registrationDate;
    private String fullName;
    private String email;

    public Customer(String code, String fullName, String email) {
        this.clientCode = code;
        this.fullName = fullName;
        this.email = email;
        this.registrationDate = new Date();
    }

    public String getClientCode() {
        return this.clientCode;
    }

    public Date getRegistrationDate() {
        return this.registrationDate;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
