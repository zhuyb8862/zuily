package com.zuily.travel.dao;

import com.zuily.travel.bean.TravelDes;
import com.zuily.travel.bean.TravelDesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelDesMapper {
    int countByExample(TravelDesExample example);

    int deleteByExample(TravelDesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelDes record);

    int insertSelective(TravelDes record);

    List<TravelDes> selectByExample(TravelDesExample example);

    TravelDes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelDes record, @Param("example") TravelDesExample example);

    int updateByExample(@Param("record") TravelDes record, @Param("example") TravelDesExample example);

    int updateByPrimaryKeySelective(TravelDes record);

    int updateByPrimaryKey(TravelDes record);
}