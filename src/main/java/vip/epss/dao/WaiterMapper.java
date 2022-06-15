package vip.epss.dao;

import com.hotel.domain.Waiter;
import com.hotel.domain.WaiterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaiterMapper {
    long countByExample(WaiterExample example);

    int deleteByExample(WaiterExample example);

    int deleteByPrimaryKey(String waiterid);

    int insert(Waiter record);

    int insertSelective(Waiter record);

    List<Waiter> selectByExample(WaiterExample example);

    Waiter selectByPrimaryKey(String waiterid);

    int updateByExampleSelective(@Param("record") Waiter record, @Param("example") WaiterExample example);

    int updateByExample(@Param("record") Waiter record, @Param("example") WaiterExample example);

    int updateByPrimaryKeySelective(Waiter record);

    int updateByPrimaryKey(Waiter record);
}