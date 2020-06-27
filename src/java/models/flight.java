 
package models;

public class flight {
    
    
    
    private String dbno;

   
    private String flightNo;
    private String depdate;
    private String deptime;
    private String aridate;
    private String aritime;
    private String cost;
    private String depairport;
    private String ariairport;

    
     public String getDbno() {
        return dbno;
    }

    public void setDbno(String dbno) {
        this.dbno = dbno;
    }
    
    public String getDepairport() {
        return depairport;
    }

    public void setDepairport(String depairport) {
        this.depairport = depairport;
    }

    public String getAriairport() {
        return ariairport;
    }

    public void setAriairport(String ariairport) {
        this.ariairport = ariairport;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDepdate() {
        return depdate;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public String getDeptime() {
        return deptime;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public String getAridate() {
        return aridate;
    }

    public void setAridate(String aridate) {
        this.aridate = aridate;
    }

    public String getAritime() {
        return aritime;
    }

    public void setAritime(String aritime) {
        this.aritime = aritime;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    
}
