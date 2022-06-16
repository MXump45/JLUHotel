package com.hotel.Controller;

import com.hotel.domain.Orders;
import com.hotel.domain.Room;
import com.hotel.domain.RoomTypeAndPrice;
import com.hotel.service.ClientOrderService;
import com.hotel.service.RoomService;
import com.hotel.service.RoomTypeService;
import com.hotel.utils.MessageAndData;
import com.hotel.utils.StringToDateConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

/**
 * @author Groza
 * @ClassName ClientOrderController
 * @Descreaption
 * @Date 17:25 2022/6/16
 */
@RestController(value = "clientOrderController")
@RequestMapping("/order")
public class ClientOrderController {
    private ClientOrderService clientOrderService;
    private RoomService roomService;
    private RoomTypeService roomTypeService;
    @Autowired
    public void setClientOrderService (ClientOrderService clientOrderService) {
        this.clientOrderService = clientOrderService;
    }
    @Autowired
    public void setRoomService(RoomService roomService){
        this.roomService = roomService;
    }
    @Autowired
    public void setRoomTypeService(RoomTypeService roomTypeService){
        this.roomTypeService = roomTypeService;
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public MessageAndData createOrder(@RequestBody(required = true) Map<String,Object> map){
        Calendar calendar= Calendar.getInstance();
        StringToDateConvert convert = new StringToDateConvert();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMddhhmmss");
        String type = (String) map.get("type");
        String intime = (String) map.get("checkintime");
        String outtime = (String) map.get("checkouttime");
        String idcard = (String) map.get("idcard");
        String oid = dateFormat.format(calendar.getTime());
        oid = oid+idcard;
        Room room = roomService.getEmptyRoom(type);
        if(room == null)
            return MessageAndData.error();
        RoomTypeAndPrice roomTypeAndPrice = roomTypeService.getTypeByRoomType(room.getRoomtype());
        Orders orders = new Orders(oid,"预定中",idcard,room.getRoomnumber(),
                convert.convert(intime),convert.convert(outtime),roomTypeAndPrice.getPrice(),null,calendar.getTime());
        Integer i = clientOrderService.addOrder(orders);
        MessageAndData messageAndData = null;
        if(i < 0){
            messageAndData = MessageAndData.error();
        } else {
            room.setRoomstatus("非空");
            roomService.statusUpdate(room);
            messageAndData = MessageAndData.success();
            messageAndData.add("count", i);
        }
        return messageAndData;
    }

}
