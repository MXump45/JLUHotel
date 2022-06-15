package com.hotel.domain;

import java.util.Date;

public class TimeExtension {
    private Integer operatingid;

    private String ordernumber;

    private Date oldexpirydate;

    private Date newexpirydate;

    private Integer addedmoney;

    public Integer getOperatingid() {
        return operatingid;
    }

    public void setOperatingid(Integer operatingid) {
        this.operatingid = operatingid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Date getOldexpirydate() {
        return oldexpirydate;
    }

    public void setOldexpirydate(Date oldexpirydate) {
        this.oldexpirydate = oldexpirydate;
    }

    public Date getNewexpirydate() {
        return newexpirydate;
    }

    public void setNewexpirydate(Date newexpirydate) {
        this.newexpirydate = newexpirydate;
    }

    public Integer getAddedmoney() {
        return addedmoney;
    }

    public void setAddedmoney(Integer addedmoney) {
        this.addedmoney = addedmoney;
    }
}