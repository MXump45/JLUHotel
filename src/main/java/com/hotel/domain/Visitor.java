package com.hotel.domain;

public class Visitor {
    private String visitorname;

    private String visitorpwd;

    private String phonenumber;

    private String email;

    @Override
    public String toString() {
        return "Visitor{" +
                "visitorname='" + visitorname + '\'' +
                ", visitorpwd='" + visitorpwd + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Visitor() {
    }

    public Visitor(String visitorname, String visitorpwd, String phonenumber, String email) {
        this.visitorname = visitorname;
        this.visitorpwd = visitorpwd;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getVisitorpwd() {
        return visitorpwd;
    }

    public void setVisitorpwd(String visitorpwd) {
        this.visitorpwd = visitorpwd;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}