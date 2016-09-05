package com.zuily.item.dao;

import com.zuily.item.bean.Jplan;
import com.zuily.item.bean.JplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JplanMapper {
    int countByExample(JplanExample example);

    int deleteByExample(JplanExample example);

    int deleteByPrimaryKey(String pid);

    int insert(Jplan record);

    int insertSelective(Jplan record);

    List<Jplan> selectByExampleWithBLOBs(JplanExample example);

    List<Jplan> selectByExample(JplanExample example);

    Jplan selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") Jplan record, @Param("example") JplanExample example);

    int updateByExampleWithBLOBs(@Param("record") Jplan record, @Param("example") JplanExample example);

    int updateByExample(@Param("record") Jplan record, @Param("example") JplanExample example);

    int updateByPrimaryKeySelective(Jplan record);

    int updateByPrimaryKeyWithBLOBs(Jplan record);

    int updateByPrimaryKey(Jplan record);
}