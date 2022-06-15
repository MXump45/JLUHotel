package com.hotel.domain;

import java.io.Serializable;

public class Room implements Serializable {
    private String roomnumber;

    private String roomtype;

    private String roomstatus;

    private String remarks;

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(String roomstatus) {
        this.roomstatus = roomstatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomnumber='" + roomnumber + '\'' +
                ", roomtype='" + roomtype + '\'' +
                ", roomstatus='" + roomstatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Room(String roomnumber, String roomtype, String roomstatus, String remarks) {
        this.roomnumber = roomnumber;
        this.roomtype = roomtype;
        this.roomstatus = roomstatus;
        this.remarks = remarks;
    }

    public Room() {
    }
}