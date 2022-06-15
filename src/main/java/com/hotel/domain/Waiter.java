package com.hotel.domain;

import java.util.Date;

public class Waiter {
    private String waiterid;

    private String waitername;

    private Date waiterbirthday;

    private String waiteridcard;

    private String waiterpassword;

    private Date waiterjoindate;

    private String waiterphonenumber;

    private String remarks;

    public String getWaiterid() {
        return waiterid;
    }

    public void setWaiterid(String waiterid) {
        this.waiterid = waiterid;
    }

    public String getWaitername() {
        return waitername;
    }

    public void setWaitername(String waitername) {
        this.waitername = waitername;
    }

    public Date getWaiterbirthday() {
        return waiterbirthday;
    }

    public void setWaiterbirthday(Date waiterbirthday) {
        this.waiterbirthday = waiterbirthday;
    }

    public String getWaiteridcard() {
        return waiteridcard;
    }

    public void setWaiteridcard(String waiteridcard) {
        this.waiteridcard = waiteridcard;
    }

    public String getWaiterpassword() {
        return waiterpassword;
    }

    public void setWaiterpassword(String waiterpassword) {
        this.waiterpassword = waiterpassword;
    }

    public Date getWaiterjoindate() {
        return waiterjoindate;
    }

    public void setWaiterjoindate(Date waiterjoindate) {
        this.waiterjoindate = waiterjoindate;
    }

    public String getWaiterphonenumber() {
        return waiterphonenumber;
    }

    public void setWaiterphonenumber(String waiterphonenumber) {
        this.waiterphonenumber = waiterphonenumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}