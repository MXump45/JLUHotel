package com.hotel.service.impl;

import com.hotel.dao.OrdersMapper;
import com.hotel.domain.Orders;
import com.hotel.service.checkOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "checkOrdersService")
public class checkOrderServiceImpl implements checkOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    public Orders findOrder(String customerIDCard){
        return ordersMapper.selectBycustomerIDCard(customerIDCard);
    }
    public List<Orders> findAllOrders(){
        return ordersMapper.selectByExample(null);
    }
}
