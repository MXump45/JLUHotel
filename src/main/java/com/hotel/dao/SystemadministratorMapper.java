package com.hotel.dao;

import com.hotel.domain.Systemadministrator;
import com.hotel.domain.SystemadministratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemadministratorMapper {
    long countByExample(SystemadministratorExample example);

    int deleteByExample(SystemadministratorExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Systemadministrator record);

    int insertSelective(Systemadministrator record);

    List<Systemadministrator> selectByExample(SystemadministratorExample example);

    Systemadministrator selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Systemadministrator record, @Param("example") SystemadministratorExample example);

    int updateByExample(@Param("record") Systemadministrator record, @Param("example") SystemadministratorExample example);

    int updateByPrimaryKeySelective(Systemadministrator record);

    int updateByPrimaryKey(Systemadministrator record);
}