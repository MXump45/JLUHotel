package com.hotel.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderTracking implements Serializable {
    private String ordernumber;

    private Date ordertime;

    private Date checkintime;

    private Date checkouttime;

    private String remarks;

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Date getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(Date checkouttime) {
        this.checkouttime = checkouttime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public OrderTracking(String ordernumber, Date ordertime, Date checkintime, Date checkouttime, String remarks) {
        this.ordernumber = ordernumber;
        this.ordertime = ordertime;
        this.checkintime = checkintime;
        this.checkouttime = checkouttime;
        this.remarks = remarks;
    }

    public OrderTracking() {
    }

    @Override
    public String toString() {
        return "OrderTracking{" +
                "ordernumber='" + ordernumber + '\'' +
                ", ordertime=" + ordertime +
                ", checkintime=" + checkintime +
                ", checkouttime=" + checkouttime +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}