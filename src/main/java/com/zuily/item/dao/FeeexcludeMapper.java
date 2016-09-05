package com.zuily.item.dao;

import com.zuily.item.bean.Feeexclude;
import com.zuily.item.bean.FeeexcludeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeexcludeMapper {
    int countByExample(FeeexcludeExample example);

    int deleteByExample(FeeexcludeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Feeexclude record);

    int insertSelective(Feeexclude record);

    List<Feeexclude> selectByExample(FeeexcludeExample example);

    Feeexclude selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Feeexclude record, @Param("example") FeeexcludeExample example);

    int updateByExample(@Param("record") Feeexclude record, @Param("example") FeeexcludeExample example);

    int updateByPrimaryKeySelective(Feeexclude record);

    int updateByPrimaryKey(Feeexclude record);
}