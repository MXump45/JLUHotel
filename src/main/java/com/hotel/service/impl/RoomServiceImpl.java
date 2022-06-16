package com.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.hotel.dao.RoomMapper;
import com.hotel.domain.Room;
import com.hotel.domain.RoomExample;
import com.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Groza
 * @ClassName RoomServiceImpl
 * @Descreaption
 * @Date 15:19 2022/6/16
 */
@Service(value = "roomServiceImpl")
public class RoomServiceImpl implements RoomService{
    private RoomMapper roomMapper;
    @Autowired
    public void setRoomMapper(RoomMapper roomMapper) { this.roomMapper = roomMapper;}
    @Override
    public Room getRoomByNumber(String num) {
        Room room = roomMapper.selectByPrimaryKey(num);
        return room;
    }



    @Override
    public List<Room> getRoomSelectiveWithPage(int currPage, int size) {
        int totalCount = (int) roomMapper.countByExample(null);
        if(currPage < 0) {
            currPage = 1;
        }
        PageHelper.startPage(currPage, size);
        List<Room> pageList = roomMapper.selectByExample(null);
        return pageList;
    }

    @Override
    public Integer getCount(String typename) {
        RoomExample example = new RoomExample();
        example.createCriteria().andRoomstatusEqualTo("空").andRoomtypeEqualTo(typename);
        return (int)roomMapper.countByExample(example);
    }

    @Override
    public Room getEmptyRoom(String type) {
        RoomExample roomExample = new RoomExample();
        roomExample.createCriteria().andRoomtypeEqualTo(type).andRoomstatusEqualTo("空");
        List<Room> list = roomMapper.selectByExample(roomExample);
        if(list.size() > 0)
            return list.get(0);
        else
            return null;
    }

    @Override
    public Integer statusUpdate(Room room) {
        Integer i = roomMapper.updateByPrimaryKey(room);
        return i;
    }


    /**
     /*获取查询记录总数
    int totalCount = employeeDao.countBySelective(employee);
        if(currPage < 0) {
        currPage = 1;
    }
    /*初始化Page 生成Page对象，传入当前页数，每页记录数，以及记录总数
    Page<Employee> page = new Page<>(currPage, pageSize, totalCount);
        if (totalCount == 0) {
        return page;
    }
    //设置map, 因为 employeeDao.selectBySelectiveWithPage(map) 需要
    Map map = new HashMap(3);
        map.put("employee", employee);
        map.put("start", page.getStart());
        map.put("pageSize", page.getPageSize());
    /*根据employee中的条件,分页查询,返回的是某一页的list (按条件查询, 分页返回)
    map中可传入employee, start, pageSize
    List<Employee> selectBySelectiveWithPage(
    Employee employee, @Param("start") Integer start, @Param("pageSize") Integer pageSize);
    List<Employee> employeeList = employeeDao.selectBySelectiveWithPage(map);
        page.setLists(employeeList);
        return page;
     */
}
