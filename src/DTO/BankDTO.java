package DTO;

import models.Credit;

import java.util.List;

public class BankDTO {
    private String nameBank;
    private List<Credit> credits;

    public BankDTO() {
        this.nameBank = nameBank;
        this.credits = credits;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return  nameBank + " " + credits ;
    }
}
