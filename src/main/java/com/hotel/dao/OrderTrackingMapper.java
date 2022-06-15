package com.hotel.dao;

import com.hotel.domain.OrderTracking;
import com.hotel.domain.OrderTrackingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTrackingMapper {
    long countByExample(OrderTrackingExample example);

    int deleteByExample(OrderTrackingExample example);

    int deleteByPrimaryKey(String ordernumber);

    int insert(OrderTracking record);

    int insertSelective(OrderTracking record);

    List<OrderTracking> selectByExample(OrderTrackingExample example);

    OrderTracking selectByPrimaryKey(String ordernumber);

    int updateByExampleSelective(@Param("record") OrderTracking record, @Param("example") OrderTrackingExample example);

    int updateByExample(@Param("record") OrderTracking record, @Param("example") OrderTrackingExample example);

    int updateByPrimaryKeySelective(OrderTracking record);

    int updateByPrimaryKey(OrderTracking record);
}