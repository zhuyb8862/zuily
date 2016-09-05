package com.zuily.item.dao;

import com.zuily.item.bean.Pics;
import com.zuily.item.bean.PicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicsMapper {
    int countByExample(PicsExample example);

    int deleteByExample(PicsExample example);

    int deleteByPrimaryKey(String pid);

    int insert(Pics record);

    int insertSelective(Pics record);

    List<Pics> selectByExampleWithBLOBs(PicsExample example);

    List<Pics> selectByExample(PicsExample example);

    Pics selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") Pics record, @Param("example") PicsExample example);

    int updateByExampleWithBLOBs(@Param("record") Pics record, @Param("example") PicsExample example);

    int updateByExample(@Param("record") Pics record, @Param("example") PicsExample example);

    int updateByPrimaryKeySelective(Pics record);

    int updateByPrimaryKeyWithBLOBs(Pics record);

    int updateByPrimaryKey(Pics record);
}