package com.hotel.domain;

import java.io.Serializable;
import java.util.Date;

public class Customers implements Serializable {
    private String customeridcard;

    private String customergender;

    private String customername;

    private Date customerbirthday;

    private String customerphonenumber;

    private String remarks;

    public String getCustomeridcard() {
        return customeridcard;
    }

    public void setCustomeridcard(String customeridcard) {
        this.customeridcard = customeridcard;
    }

    public String getCustomergender() {
        return customergender;
    }

    public void setCustomergender(String customergender) {
        this.customergender = customergender;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Date getCustomerbirthday() {
        return customerbirthday;
    }

    public void setCustomerbirthday(Date customerbirthday) {
        this.customerbirthday = customerbirthday;
    }

    public String getCustomerphonenumber() {
        return customerphonenumber;
    }

    public void setCustomerphonenumber(String customerphonenumber) {
        this.customerphonenumber = customerphonenumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customeridcard='" + customeridcard + '\'' +
                ", customergender='" + customergender + '\'' +
                ", customername='" + customername + '\'' +
                ", customerbirthday=" + customerbirthday +
                ", customerphonenumber='" + customerphonenumber + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Customers() {
    }

    public Customers(String customeridcard, String customergender, String customername, Date customerbirthday, String customerphonenumber, String remarks) {
        this.customeridcard = customeridcard;
        this.customergender = customergender;
        this.customername = customername;
        this.customerbirthday = customerbirthday;
        this.customerphonenumber = customerphonenumber;
        this.remarks = remarks;
    }
}