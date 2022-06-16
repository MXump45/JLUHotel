package com.hotel.service.impl;

import com.hotel.dao.OrdersMapper;
import com.hotel.domain.Orders;
import com.hotel.service.ClientOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Groza
// * @ClassName ClientOrderServiceImpl
// * @Descreaption
// * @Date 17:19 2022/6/16
// */
@Service(value = "clientOrderServiceImpl")
public class ClientOrderServiceImpl implements ClientOrderService{
    private OrdersMapper ordersMapper;
    @Autowired
    public void setOrdersMapper(OrdersMapper ordersMapper) {this.ordersMapper = ordersMapper;}
    @Override
    public Integer addOrder(Orders orders) {
        return ordersMapper.insert(orders);
    }
}
