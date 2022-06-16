package com.hotel.service;

import com.hotel.domain.Visitor;

/**
 * @author Groza
 * @InterfaceName VisitorServiceImpl
 * @Descreaption
 * @Date 23:37 2022/6/16
 */
public interface VisitorService {
    public Visitor Login(String visitorName, String visitorPwd);
    public Integer register(Visitor visitor);
}
