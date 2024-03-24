package models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private int idClient;
    private String nameClient;
    private String lastName;
    private String email;
    private String login;
    private String pass;
    private List<Bank> banks = new ArrayList<>();


    public Client() {
    }


    public Client(String nameClient, String lastName, String email, String login, String pass) {
        this.nameClient = nameClient;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.pass = pass;
    }

    public boolean isEmpty() {
        if (nameClient == null && lastName == null && email == null){
            return true;
        } return false;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}