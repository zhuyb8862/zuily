package com.zuily.travel.dao;

import com.zuily.travel.bean.TravelPics;
import com.zuily.travel.bean.TravelPicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelPicsMapper {
    int countByExample(TravelPicsExample example);

    int deleteByExample(TravelPicsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(TravelPics record);

    int insertSelective(TravelPics record);

    List<TravelPics> selectByExample(TravelPicsExample example);

    TravelPics selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") TravelPics record, @Param("example") TravelPicsExample example);

    int updateByExample(@Param("record") TravelPics record, @Param("example") TravelPicsExample example);

    int updateByPrimaryKeySelective(TravelPics record);

    int updateByPrimaryKey(TravelPics record);
}