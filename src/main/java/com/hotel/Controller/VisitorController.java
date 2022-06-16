package com.hotel.Controller;

import com.hotel.domain.Visitor;
import com.hotel.service.VisitorService;
import com.hotel.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Groza
 * @ClassName VisitorController
 * @Descreaption
 * @Date 23:44 2022/6/16
 */
@RestController(value = "visitorController")
@RequestMapping("/visitor")
public class VisitorController {
    private VisitorService visitorService;
    @Autowired
    public void setVisitorService(VisitorService visitorService) {this.visitorService = visitorService;}
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public MessageAndData login(@RequestBody(required = true)Map<String, Object> map){
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        Visitor visitor = visitorService.Login(username,password);
        if (visitor != null){
            return MessageAndData.success();
        }else{
            return MessageAndData.error();
        }
    }
    //{username: 'admin', password: '111111', rePassword: '111111', phone: '17855555555', email: ''}
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public MessageAndData register(@RequestBody(required = true)Map<String, Object> map){
        String visitorName = (String) map.get("username");
        String visitorPwd = (String) map.get("password");
        String phone = (String) map.get("phone");
        String email = (String) map.get("email");
        Visitor visitor = new Visitor(visitorName,visitorPwd,phone,email);
        Integer ret = visitorService.register(visitor);
        if(ret>0){
            return MessageAndData.success();
        }else{
            MessageAndData err = MessageAndData.error();
            err.setMessage("用户名重复");
            return err;
        }
    }

}
