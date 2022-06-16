package com.hotel.service;

import com.hotel.domain.Systemadministrator;

/**
 * @author Groza
 * @InterfaceName SystemAdministrator
 * @Descreaption
 * @Date 22:47 2022/6/16
 */
public interface SystemAdministratorService {
    public Systemadministrator login(String userName, String password);
    public Integer register(Systemadministrator systemadministrator);
}
