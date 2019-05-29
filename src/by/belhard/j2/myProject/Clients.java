package by.belhard.j2.myProject;

import java.util.Date;

public class Clients {

    private int id;
    private String name;
    private Date application_date;
    private Date decision_date;
    private int visa_id;
    private String status;

    public Clients(int id, String name, Date application_date, Date decision_date, int visa_id, String status) {

        this.id = id;
        this.name = name;
        this.application_date = application_date;
        this.decision_date = decision_date;
        this.visa_id = visa_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getApplication_date() {
        return application_date;
    }

    public void setApplication_date(Date application_date) {
        this.application_date = application_date;
    }

    public Date getDecision_date() {
        return decision_date;
    }

    public void setDecision_date(Date decision_date) {
        this.decision_date = decision_date;
    }

    public int getVisa_id() {
        return visa_id;
    }

    public void setVisa_id(int visa_id) {
        this.visa_id = visa_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
