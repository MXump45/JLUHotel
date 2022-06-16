package com.hotel.service;

import com.hotel.domain.RoomTypeAndPrice;

import java.util.List;

/**
 * @author Groza
 * @InterfaceName RoomTypeService
 * @Descreaption
 * @Date 16:54 2022/6/16
 */
public interface RoomTypeService {
    public RoomTypeAndPrice getTypeByRoomType(String id);
    public List<RoomTypeAndPrice> getAllType();
}
