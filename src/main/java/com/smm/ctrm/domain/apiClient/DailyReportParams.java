package com.smm.ctrm.domain.apiClient;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyReportParams {
	@JsonProperty(value = "Flag")
	private String Flag;
	
	@JsonProperty(value = "BeginDate")
	private Date BeginDate;
	
	@JsonProperty(value = "EndDate")
	private Date EndDate;

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public Date getBeginDate() {
		return BeginDate;
	}

	public void setBeginDate(Date beginDate) {
		BeginDate = beginDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}
