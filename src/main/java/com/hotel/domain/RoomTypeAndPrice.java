package com.hotel.domain;

public class RoomTypeAndPrice {
    private String roomtype;

    private Integer price;

    private String desc;

    private String url;

    @Override
    public String toString() {
        return "RoomTypeAndPrice{" +
                "roomtype='" + roomtype + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public RoomTypeAndPrice(String roomtype, Integer price, String desc, String url) {
        this.roomtype = roomtype;
        this.price = price;
        this.desc = desc;
        this.url = url;
    }

    public RoomTypeAndPrice() {
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}