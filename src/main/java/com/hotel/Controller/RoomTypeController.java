package com.hotel.Controller;

import com.hotel.domain.ClientRoomShow;
import com.hotel.domain.RoomTypeAndPrice;
import com.hotel.service.RoomService;
import com.hotel.service.RoomTypeService;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Groza
 * @ClassName RoomTypeController
 * @Descreaption
 * @Date 17:04 2022/6/16
 */
@RestController(value = "roomTypeController")
@RequestMapping("/roomtype")
public class RoomTypeController {
    private RoomTypeService roomTypeService;
    private RoomService roomService;
    @Autowired
    public void setRoomTypeService(RoomTypeService roomTypeService) {this.roomTypeService = roomTypeService;}
    @Autowired
    public void setRoomService(RoomService roomService) {this.roomService = roomService;}
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public MessageAndData getRoomType(){
        List<RoomTypeAndPrice> roomTypeAndPrice = roomTypeService.getAllType();
        List<ClientRoomShow> clientRoomShowList = new ArrayList<>();
        for(RoomTypeAndPrice r: roomTypeAndPrice){
            Integer i = roomService.getCount(r.getRoomtype());
            clientRoomShowList.add(new ClientRoomShow(r,i));
        }
        MessageAndData messageAndData = null;
        if(roomTypeAndPrice == null) {
            messageAndData = MessageAndData.error();
        }else {
            messageAndData = MessageAndData.success();
            messageAndData.add("roomtype", clientRoomShowList);
        }
        return messageAndData;
    }
}
