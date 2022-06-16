package com.hotel.service.impl;

import com.hotel.dao.RoomTypeAndPriceMapper;
import com.hotel.dao.SystemadministratorMapper;
import com.hotel.domain.Systemadministrator;
import com.hotel.domain.SystemadministratorExample;
import com.hotel.service.SystemAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Groza
 * @ClassName SystemAdministratorServiceImpl
 * @Descreaption
 * @Date 22:47 2022/6/16
 */
@Service(value = "systemAdministratorServiceImpl")
public class SystemAdministratorServiceImpl implements SystemAdministratorService {
    private SystemadministratorMapper systemadministratorMapper;
    @Autowired
    public void setSystemadministratorMapper(SystemadministratorMapper systemadministratorMapper){
        this.systemadministratorMapper = systemadministratorMapper;
    }

    @Override
    public Systemadministrator login(String userID, String password) {
        SystemadministratorExample example = new SystemadministratorExample();
        example.createCriteria().andUseridEqualTo(userID).andUserpasswordEqualTo(password);
        List<Systemadministrator> list = systemadministratorMapper.selectByExample(example);
        return list.get(0);
    }

    @Override
    public Integer register(Systemadministrator systemadministrator) {
        return systemadministratorMapper.insert(systemadministrator);
    }
}
