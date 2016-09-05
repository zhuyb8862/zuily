package com.zuily.banner.dao;

import com.zuily.banner.bean.Bannerpic;
import com.zuily.banner.bean.BannerpicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerpicMapper {
    int countByExample(BannerpicExample example);

    int deleteByExample(BannerpicExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Bannerpic record);

    int insertSelective(Bannerpic record);

    List<Bannerpic> selectByExample(BannerpicExample example);

    Bannerpic selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Bannerpic record, @Param("example") BannerpicExample example);

    int updateByExample(@Param("record") Bannerpic record, @Param("example") BannerpicExample example);

    int updateByPrimaryKeySelective(Bannerpic record);

    int updateByPrimaryKey(Bannerpic record);
}