package com.hotel.service.impl;

import com.hotel.dao.OrdersMapper;
import com.hotel.domain.Orders;
import com.hotel.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "checkService")
public class CheckServiceImpl  implements CheckService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public boolean checkin(String orderNumber) {
        Orders order = ordersMapper.selectByPrimaryKey(orderNumber);
        String status = order.getOrderstatus();
        if(status.equals("预约中")){
            order.setOrderstatus("已入住");
            ordersMapper.updateByPrimaryKeySelective(order);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkout(String orderNumber) {
        Orders order = ordersMapper.selectByPrimaryKey(orderNumber);
        String status = order.getOrderstatus();
        if(status.equals("已入住")){
            order.setOrderstatus("已退房");
            ordersMapper.updateByPrimaryKeySelective(order);
            return true;
        }
        return false;
    }
}
