package com.hotel.service;


import com.hotel.domain.Orders;
import java.util.List;

public interface checkOrdersService {
    Orders findOrder(String customerIDCard);
    List<Orders>  findAllOrders();
}
