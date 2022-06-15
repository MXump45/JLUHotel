package com.hotel.Controller;

import com.hotel.domain.Room;
import com.hotel.service.TestService;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Groza
 * @ClassName TestRESTFulController
 * @Descreaption
 * @Date 1:06 2022/6/16
 */
@RestController(value = "testRESTFulController")
@RequestMapping("/resttest")
public class TestRESTFulController {
    private TestService service;
    @Autowired
    public void setService(TestService service) {
        this.service = service;
    }
    @RequestMapping(value = "/room/{rid}", method = RequestMethod.GET)
    public MessageAndData test01(@PathVariable String rid){
        Room room = service.findRoom(rid);
        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj", room).setMessage("查询成功");
        return messageAndData;
    }
}
