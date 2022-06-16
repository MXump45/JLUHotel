package com.hotel.service.impl;

import com.hotel.dao.RoomTypeAndPriceMapper;
import com.hotel.domain.RoomTypeAndPrice;
import com.hotel.domain.RoomTypeAndPriceExample;
import com.hotel.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Groza
 * @ClassName RoomTypeImpl
 * @Descreaption
 * @Date 16:48 2022/6/16
 */
@Service(value = "roomTypeServiceImpl")
public class RoomTypeServiceImpl implements RoomTypeService {
    private RoomTypeAndPriceMapper roomTypeAndPriceMapper;

    @Autowired
    public void setRoomTypeAndPriceMapper(RoomTypeAndPriceMapper roomTypeAndPriceMapper) {
        this.roomTypeAndPriceMapper = roomTypeAndPriceMapper;
    }
    @Override
    public RoomTypeAndPrice getTypeByRoomType(String id) {
        return roomTypeAndPriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<RoomTypeAndPrice> getAllType() {
        RoomTypeAndPriceExample roomTypeAndPriceExample = new RoomTypeAndPriceExample();
        roomTypeAndPriceExample.createCriteria();
        List<RoomTypeAndPrice> list = roomTypeAndPriceMapper.selectByExample(roomTypeAndPriceExample);
        return list;
    }

}
