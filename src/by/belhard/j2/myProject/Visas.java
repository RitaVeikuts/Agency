package by.belhard.j2.myProject;


public class Visas {

    private int id;
    private String  country;
    private int visa_fee;
    private String visa_fee_currency;
    private int cost;


    public Visas(int i, String vdoij, int i1, String usd, int i2) {
        this.id = id;
        this.country = country;
        this.visa_fee = visa_fee;
        this.visa_fee_currency = visa_fee_currency;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVisa_fee() {
        return visa_fee;
    }

    public void setVisa_fee(int visa_fee) {
        this.visa_fee = visa_fee;
    }

    public String getVisa_fee_currency() {
        return visa_fee_currency;
    }

    public void setVisa_fee_currency(String visa_fee_currency) {
        this.visa_fee_currency = visa_fee_currency;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
