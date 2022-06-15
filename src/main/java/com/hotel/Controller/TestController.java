package com.hotel.Controller;

import com.hotel.domain.Room;
import com.hotel.service.TestService;
import com.hotel.service.impl.TestServiceImpl;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Groza
 * @ClassName TestController
 * @Descreaption
 * @Date 0:14 2022/6/16
 */
@Controller(value = "roomController")
@RequestMapping("/test")
public class TestController {
    private TestService service;
    @Autowired
    public void setService(TestService service) {
        this.service = service;
    }
    @RequestMapping("/get")
    public MessageAndData test01(){
        Room room = service.findRoom("000001");
        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj", room).setMessage("查询成功");
        return messageAndData;
    }
    @RequestMapping("test2")
    public void test02(){
        List<Room> list = service.selectAll();
    }
}
