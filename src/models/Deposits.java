package models;

public class Deposits {
    private int id;
    private String DepositsName;
    private int DepositsBid;

    public Deposits(int id, String depositsName, int depositsBid) {
        this.id = id;
        DepositsName = depositsName;
        DepositsBid = depositsBid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepositsName() {
        return DepositsName;
    }

    public void setDepositsName(String depositsName) {
        DepositsName = depositsName;
    }

    public int getDepositsBid() {
        return DepositsBid;
    }

    public void setDepositsBid(int depositsBid) {
        DepositsBid = depositsBid;
    }

    @Override
    public String toString() {
        return id + DepositsName + DepositsBid;
    }
}