package com.hotel.Controller;

import com.hotel.domain.Orders;
import com.hotel.service.checkOrdersService;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController(value = "checkOrdersController")
@RequestMapping("/checkOrders")
public class checkOrdersController {
    @Autowired
    private checkOrdersService service;

    /*
    查询所有的订单
     */
    @RequestMapping(value = "/All", method = RequestMethod.GET)
    public MessageAndData findAllOrders(){
        List<Orders> orders = service.findAllOrders();

        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj", orders).setMessage("查询成功");
        return messageAndData;
    }

    /*
    根据用户身份证号码查询订单
     */
    @RequestMapping(value = "/one/{customerIDCard}", method = RequestMethod.GET)
    public MessageAndData findOrder(@PathVariable String customerIDCard){
        Orders orders = service.findOrder(customerIDCard);

        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj", orders).setMessage("查询成功");
        return messageAndData;
    }


}
