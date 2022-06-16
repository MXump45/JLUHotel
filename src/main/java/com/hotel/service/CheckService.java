package com.hotel.service;

public interface CheckService {

    boolean checkin(String orderNumber);
    boolean checkout(String orderNumber);

}
