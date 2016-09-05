package com.zuily.item.bean;

import java.util.List;

import com.zuily.item.bean.Feeexclude;
import com.zuily.item.bean.Feeinclude;
import com.zuily.item.bean.Items;
import com.zuily.item.bean.Jplan;
import com.zuily.item.bean.Jtime;
import com.zuily.item.bean.Notice;
import com.zuily.item.bean.Pics;

public class ItemDetal {
	private Items item;
	private List<Jplan> plans;
	private List<Jtime> times;
	private List<Feeexclude> feeexs;
	private List<Feeinclude> feeins;
	private List<Notice> notices;
	private List<Pics> pics;
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public List<Jplan> getPlans() {
		return plans;
	}
	public void setPlans(List<Jplan> plans) {
		this.plans = plans;
	}
	public List<Jtime> getTimes() {
		return times;
	}
	public void setTimes(List<Jtime> times) {
		this.times = times;
	}
	public List<Feeexclude> getFeeexs() {
		return feeexs;
	}
	public void setFeeexs(List<Feeexclude> feeexs) {
		this.feeexs = feeexs;
	}
	public List<Feeinclude> getFeeins() {
		return feeins;
	}
	public void setFeeins(List<Feeinclude> feeins) {
		this.feeins = feeins;
	}
	public List<Notice> getNotices() {
		return notices;
	}
	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}
	public List<Pics> getPics() {
		return pics;
	}
	public void setPics(List<Pics> pics) {
		this.pics = pics;
	}
	

}
