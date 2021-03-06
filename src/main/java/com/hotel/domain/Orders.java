package com.hotel.domain;

import java.util.Date;

public class Orders {
    private String ordernumber;

    private String orderstatus;

    private String customeridcard;

    private String roomnumber;

    private Date checkintime;

    private Date checkouttime;

    private Integer totalmoney;

    private String remarks;

    private Date ordertime;

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getCustomeridcard() {
        return customeridcard;
    }

    public void setCustomeridcard(String customeridcard) {
        this.customeridcard = customeridcard;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
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

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordernumber='" + ordernumber + '\'' +
                ", orderstatus='" + orderstatus + '\'' +
                ", customeridcard='" + customeridcard + '\'' +
                ", roomnumber='" + roomnumber + '\'' +
                ", checkintime=" + checkintime +
                ", checkouttime=" + checkouttime +
                ", totalmoney=" + totalmoney +
                ", remarks='" + remarks + '\'' +
                ", ordertime=" + ordertime +
                '}';
    }

    public Orders(String ordernumber, String orderstatus, String customeridcard, String roomnumber, Date checkintime, Date checkouttime, Integer totalmoney, String remarks, Date ordertime) {
        this.ordernumber = ordernumber;
        this.orderstatus = orderstatus;
        this.customeridcard = customeridcard;
        this.roomnumber = roomnumber;
        this.checkintime = checkintime;
        this.checkouttime = checkouttime;
        this.totalmoney = totalmoney;
        this.remarks = remarks;
        this.ordertime = ordertime;
    }

    public Orders() {
    }
}