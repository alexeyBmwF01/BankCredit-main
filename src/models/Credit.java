package models;

import java.sql.ResultSet;

public class Credit {
    private int id;
    private String nameCredit;
    private int creditsBid;

    public Credit(int id, String nameCredit, int creditsBid) {
        this.id = id;
        this.nameCredit = nameCredit;
        this.creditsBid = creditsBid;
    }

    public Credit(){
    }

    public Credit(ResultSet rs) throws Exception{
        setId(rs.getInt("id"));
        setNameCredit(rs.getString("CreditsName"));
        setCreditsBid(rs.getInt("CreditsBid"));
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
        return id + "-" + nameCredit + " " + creditsBid + "%" + '\n';
    }
}
