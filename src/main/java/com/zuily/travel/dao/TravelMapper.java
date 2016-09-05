package com.zuily.travel.dao;

import com.zuily.travel.bean.Travel;
import com.zuily.travel.bean.TravelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelMapper {
    int countByExample(TravelExample example);

    int deleteByExample(TravelExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Travel record);

    int insertSelective(Travel record);

    List<Travel> selectByExample(TravelExample example);

    Travel selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Travel record, @Param("example") TravelExample example);

    int updateByExample(@Param("record") Travel record, @Param("example") TravelExample example);

    int updateByPrimaryKeySelective(Travel record);

    int updateByPrimaryKey(Travel record);
}