package com.zuily.item.dao;

import com.zuily.item.bean.Feeinclude;
import com.zuily.item.bean.FeeincludeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeincludeMapper {
    int countByExample(FeeincludeExample example);

    int deleteByExample(FeeincludeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Feeinclude record);

    int insertSelective(Feeinclude record);

    List<Feeinclude> selectByExample(FeeincludeExample example);

    Feeinclude selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Feeinclude record, @Param("example") FeeincludeExample example);

    int updateByExample(@Param("record") Feeinclude record, @Param("example") FeeincludeExample example);

    int updateByPrimaryKeySelective(Feeinclude record);

    int updateByPrimaryKey(Feeinclude record);
}