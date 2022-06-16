package com.hotel.domain;

/**
 * @author Groza
 * @ClassName ClientRoomShow
 * @Descreaption
 * @Date 21:46 2022/6/16
 */
public class ClientRoomShow {
    RoomTypeAndPrice roomTypeAndPrice;
    Integer count;

    public ClientRoomShow(RoomTypeAndPrice roomTypeAndPrice, Integer count) {
        this.roomTypeAndPrice = roomTypeAndPrice;
        this.count = count;
    }

    public ClientRoomShow() {
    }

    @Override
    public String toString() {
        return "ClientRoomShow{" +
                "roomTypeAndPrice=" + roomTypeAndPrice +
                ", count=" + count +
                '}';
    }

    public RoomTypeAndPrice getRoomTypeAndPrice() {
        return roomTypeAndPrice;
    }

    public void setRoomTypeAndPrice(RoomTypeAndPrice roomTypeAndPrice) {
        this.roomTypeAndPrice = roomTypeAndPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
