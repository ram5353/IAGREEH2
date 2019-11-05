package com.example.demo.dto;

import java.util.Date;

public class ProcessDetails {
	private String vgUuid;
	private String vgStatus;
	private Date  vgVerfallsdatum;
	private Date vgEingestelltAm;
	private Integer sysId;
	private String LastUpdatedClientId;
	public String SysName;
	public String hisHistoryEvent; 
	
	public String getSysName() {
		return SysName;
	}
	public void setSysName(String sysName) {
		SysName = sysName;
	}
	public String getHisHistoryEvent() {
		return hisHistoryEvent;
	}
	public void setHisHistoryEvent(String hisHistoryEvent) {
		this.hisHistoryEvent = hisHistoryEvent;
	}
	public String getVgUuid() {
		return vgUuid;
	}
	public void setVgUuid(String vgUuid) {
		this.vgUuid = vgUuid;
	}
	public String getVgStatus() {
		return vgStatus;
	}
	public void setVgStatus(String vgStatus) {
		this.vgStatus = vgStatus;
	}
	public Date getVgVerfallsdatum() {
		return vgVerfallsdatum;
	}
	public void setVgVerfallsdatum(Date vgVerfallsdatum) {
		this.vgVerfallsdatum = vgVerfallsdatum;
	}
	public Date getVgEingestelltAm() {
		return vgEingestelltAm;
	}
	public void setVgEingestelltAm(Date vgEingestelltAm) {
		this.vgEingestelltAm = vgEingestelltAm;
	}
	public Integer getSysId() {
		return sysId;
	}
	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}
	public String getLastUpdatedClientId() {
		return LastUpdatedClientId;
	}
	public void setLastUpdatedClientId(String lastUpdatedClientId) {
		LastUpdatedClientId = lastUpdatedClientId;
	}
	
	
	
	

}
