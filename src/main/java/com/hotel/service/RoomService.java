package com.hotel.service;

import com.hotel.domain.Room;

import java.util.List;
import java.util.Map;

/**
 * @author Groza
 * @InterfaceName RoomService
 * @Descreaption
 * @Date 15:13 2022/6/16
 */
public interface RoomService {
    Room getRoomByNumber(String num);
    List<Room> getRoomSelectiveWithPage(int currPage, int size);
    Integer getCount(String typename);
    Room getEmptyRoom(String type);
    Integer statusUpdate(Room room);
}
