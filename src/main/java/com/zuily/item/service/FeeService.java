package com.zuily.item.service;

import java.util.List;

import com.zuily.item.bean.Feeexclude;
import com.zuily.item.bean.Feeinclude;

public interface FeeService {
	public void insertIncludeFee(Feeinclude feeInclud )throws Exception;
	public void insertExcludeFee(Feeexclude feeExclud )throws Exception;
	public List<Feeexclude> selectByIid(int id);

	public List<Feeinclude> selectFeeinByIid(int id);

}
