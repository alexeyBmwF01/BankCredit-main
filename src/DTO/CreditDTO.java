package DTO;

public class CreditDTO {
    private int id;
    private String nameCredit;
    private int creditsBid;

    public CreditDTO(int id, String nameCredit, int creditsBid) {
        this.id = id;
        this.nameCredit = nameCredit;
        this.creditsBid = creditsBid;
    }
    public CreditDTO(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCredit() {
        return nameCredit;
    }

    public void setNameCredit(String nameCredit) {
        this.nameCredit = nameCredit;
    }

    public int getCreditsBid() {
        return creditsBid;
    }

    public void setCreditsBid(int creditsBid) {
        this.creditsBid = creditsBid;
    }

    @Override
    public String toString() {
        return id + " " + nameCredit + " " + creditsBid;
    }
}
