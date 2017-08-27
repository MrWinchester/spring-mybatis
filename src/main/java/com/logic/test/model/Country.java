package com.logic.test.model;

import java.util.Date;

public class Country {
	private String countryId;
	private String parentCountryId;
	private String countryName;
	private Date createDate;
	private int state;
	private String desc_ ;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getParentCountryId() {
		return parentCountryId;
	}
	public void setParentCountryId(String parentCountryId) {
		this.parentCountryId = parentCountryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getDesc_() {
		return desc_;
	}
	public void setDesc_(String desc_) {
		this.desc_ = desc_;
	}
	
	
}
