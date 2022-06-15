package com.hotel.dao;

import com.hotel.domain.TimeExtension;
import com.hotel.domain.TimeExtensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeExtensionMapper {
    long countByExample(TimeExtensionExample example);

    int deleteByExample(TimeExtensionExample example);

    int deleteByPrimaryKey(Integer operatingid);

    int insert(TimeExtension record);

    int insertSelective(TimeExtension record);

    List<TimeExtension> selectByExample(TimeExtensionExample example);

    TimeExtension selectByPrimaryKey(Integer operatingid);

    int updateByExampleSelective(@Param("record") TimeExtension record, @Param("example") TimeExtensionExample example);

    int updateByExample(@Param("record") TimeExtension record, @Param("example") TimeExtensionExample example);

    int updateByPrimaryKeySelective(TimeExtension record);

    int updateByPrimaryKey(TimeExtension record);
}