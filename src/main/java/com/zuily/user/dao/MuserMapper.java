package com.zuily.user.dao;

import com.zuily.item.bean.Muser;
import com.zuily.item.bean.MuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuserMapper {
    int countByExample(MuserExample example);

    int deleteByExample(MuserExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Muser record);

    int insertSelective(Muser record);

    List<Muser> selectByExample(MuserExample example);

    Muser selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Muser record, @Param("example") MuserExample example);

    int updateByExample(@Param("record") Muser record, @Param("example") MuserExample example);

    int updateByPrimaryKeySelective(Muser record);

    int updateByPrimaryKey(Muser record);
}