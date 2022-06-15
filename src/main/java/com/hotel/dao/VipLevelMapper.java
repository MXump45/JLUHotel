package com.hotel.dao;

import com.hotel.domain.VipLevel;
import com.hotel.domain.VipLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipLevelMapper {
    long countByExample(VipLevelExample example);

    int deleteByExample(VipLevelExample example);

    int deleteByPrimaryKey(Short level);

    int insert(VipLevel record);

    int insertSelective(VipLevel record);

    List<VipLevel> selectByExample(VipLevelExample example);

    VipLevel selectByPrimaryKey(Short level);

    int updateByExampleSelective(@Param("record") VipLevel record, @Param("example") VipLevelExample example);

    int updateByExample(@Param("record") VipLevel record, @Param("example") VipLevelExample example);

    int updateByPrimaryKeySelective(VipLevel record);

    int updateByPrimaryKey(VipLevel record);
}