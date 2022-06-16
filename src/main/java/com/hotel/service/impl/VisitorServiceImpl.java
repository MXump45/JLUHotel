package com.hotel.service.impl;

import com.hotel.dao.VisitorMapper;
import com.hotel.domain.Visitor;
import com.hotel.domain.VisitorExample;
import com.hotel.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Groza
 * @ClassName VisitorImpl
 * @Descreaption
 * @Date 23:39 2022/6/16
 */
@Service(value = "visitorServiceImpl")
public class VisitorServiceImpl implements VisitorService {
    private VisitorMapper visitorMapper;
    @Autowired
    public void setVisitorMapper(VisitorMapper visitorMapper) {this.visitorMapper = visitorMapper;}
    @Override
    public Visitor Login(String visitorName, String visitorPwd) {
        VisitorExample visitorExample = new VisitorExample();
        visitorExample.createCriteria().andVisitornameEqualTo(visitorName).andVisitorpwdEqualTo(visitorPwd);
        List<Visitor> list = visitorMapper.selectByExample(visitorExample);
        if(list.size()>0)
            return list.get(0);
        else
            return null;

    }

    @Override
    public Integer register(Visitor visitor) {
        try {
            Integer re = visitorMapper.insert(visitor);
            return re;
        }catch (Exception e) {
            return 0;
        }
    }
}
