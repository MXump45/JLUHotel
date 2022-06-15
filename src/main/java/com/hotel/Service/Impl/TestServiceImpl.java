package com.hotel.Service.Impl;

import com.hotel.Service.TestService;
import com.hotel.dao.RoomMapper;
import com.hotel.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Groza
 * @ClassName UserServiceImpl
 * @Descreaption
 * @Date 23:09 2022/6/15
 */
@Service(value = "testService")
public class TestServiceImpl implements TestService {
    private RoomMapper roomMapper;
    @Override
    public Room findRoom(String id) {
        return roomMapper.selectByPrimaryKey(id);
    }
    @Autowired
    public void setRoomMapper(RoomMapper roomMapper) {
        this.roomMapper = roomMapper;
    }
}
