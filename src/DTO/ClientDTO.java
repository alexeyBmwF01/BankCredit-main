package DTO;

import models.Bank;

import java.util.ArrayList;
import java.util.List;

public class ClientDTO {
    private int idClient;
    private String nameClient;
    private String lastName;
    private String email;
    private String login;
    private List<Bank> banks = new ArrayList<>();

    public ClientDTO(int idClient, String nameClient, String lastName, String email, List<Bank> banks) {
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.lastName = lastName;
        this.email = email;
        this.banks = banks;
    }
    public ClientDTO(){
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

    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }
}
