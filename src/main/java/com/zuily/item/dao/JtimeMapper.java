package com.zuily.item.dao;

import com.zuily.item.bean.Jtime;
import com.zuily.item.bean.JtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JtimeMapper {
    int countByExample(JtimeExample example);

    int deleteByExample(JtimeExample example);

    int deleteByPrimaryKey(String tid);

    int insert(Jtime record);

    int insertSelective(Jtime record);

    List<Jtime> selectByExample(JtimeExample example);

    Jtime selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") Jtime record, @Param("example") JtimeExample example);

    int updateByExample(@Param("record") Jtime record, @Param("example") JtimeExample example);

    int updateByPrimaryKeySelective(Jtime record);

    int updateByPrimaryKey(Jtime record);
}