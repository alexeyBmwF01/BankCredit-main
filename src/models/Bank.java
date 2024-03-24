package models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Bank {
    private int idBank;
    private String nameBank;
    private List<Credit> credits;
    private List<Client> clients;

    public Bank(int idBank, String nameBank, List<Credit> credits, List<Client> clients) {
        this.idBank = idBank;
        this.nameBank = nameBank;
        this.credits = credits;
        this.clients = clients;
    }

    public Bank() {
    }

    public Bank(ResultSet rs) throws SQLException {
        setIdBank(rs.getInt("idBank"));
        setNameBank(rs.getString("bankName"));
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return idBank + "-" + nameBank + '\n';
    }
}

