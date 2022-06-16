package com.hotel.Controller;

import com.hotel.domain.Room;
import com.hotel.service.RoomService;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Groza
 * @ClassName RoomController
 * @Descreaption
 * @Date 15:31 2022/6/16
 */
@RestController(value = "roomController")
@RequestMapping("/room")
public class RoomController {
    private RoomService roomService;
    @RequestMapping(value = "/num/{rid}", method = RequestMethod.GET)
    public MessageAndData getRoomByNum(@PathVariable String rid) {
        Room room = roomService.getRoomByNumber(rid);
        MessageAndData messageAndData = null;
        if(room != null) {
            messageAndData = MessageAndData.success();
            messageAndData.add("room", room);
        } else {
            messageAndData = MessageAndData.error();
        }
        return messageAndData;
    }
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public MessageAndData getRoomByPage(@RequestParam(name = "currPage", defaultValue = "1") int currPage,
                                         @RequestParam(name = "pageSize", defaultValue = "5") int pageSize){
        if(currPage < 1 && pageSize < 1){
            return MessageAndData.error();
        }
        List<Room> pageList = roomService.getRoomSelectiveWithPage(currPage, pageSize);
        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("list", pageList);
        return messageAndData;
    }
    @Autowired
    public void setRoomService(RoomService service) {this.roomService = service;}

}
