package com.hotel.Controller;

import com.hotel.domain.Orders;
import com.hotel.service.CheckService;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "checkController")
@RequestMapping("/check")
public class CheckController {

    @Autowired
    private CheckService service;

    @RequestMapping(value = "/in/{customerIDCard} ", method = RequestMethod.GET)
    public MessageAndData checkin(@PathVariable String customerIDCard){
        System.out.println("11111111111111111");
        boolean bool = service.checkin(customerIDCard);

        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj", bool).setMessage("查询成功");
        return messageAndData;
    }



}
