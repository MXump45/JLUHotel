package com.hotel.dao;

import com.hotel.domain.RoomTypeAndPrice;
import com.hotel.domain.RoomTypeAndPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomTypeAndPriceMapper {
    long countByExample(RoomTypeAndPriceExample example);

    int deleteByExample(RoomTypeAndPriceExample example);

    int deleteByPrimaryKey(String roomtype);

    int insert(RoomTypeAndPrice record);

    int insertSelective(RoomTypeAndPrice record);

    List<RoomTypeAndPrice> selectByExample(RoomTypeAndPriceExample example);

    RoomTypeAndPrice selectByPrimaryKey(String roomtype);

    int updateByExampleSelective(@Param("record") RoomTypeAndPrice record, @Param("example") RoomTypeAndPriceExample example);

    int updateByExample(@Param("record") RoomTypeAndPrice record, @Param("example") RoomTypeAndPriceExample example);

    int updateByPrimaryKeySelective(RoomTypeAndPrice record);

    int updateByPrimaryKey(RoomTypeAndPrice record);

}