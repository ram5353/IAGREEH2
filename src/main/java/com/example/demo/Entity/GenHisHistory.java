package com.example.demo.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GenHisHistory {
	
	@Id
	@Column
	private Integer hisId;
	
	@Column
	private Integer hisUser;
	
	@Column
	private String hisProcessUuid;
	
	@Column
	private String hisOriginProcessid;
	
	@Column
	private String hisProcessStatus;
	
	@Column
	private Integer sysId;
	
	@Column
	private String hisHistoryEvent;
	
	@Column
	private String hisOrginDocId;
	
	@Column
	private String hisDocUuid;
	
	@Column 
	private String hisDocStorageSystem;
	
	@Column
	private Timestamp hisTimestamp;
	
	@Column 
	private String hisUserRacf;
	
	@Column
	private String hisSysName;

	public Integer getHisId() {
		return hisId;
	}

	public void setHisId(Integer hisId) {
		this.hisId = hisId;
	}

	public Integer getHisUser() {
		return hisUser;
	}

	public void setHisUser(Integer hisUser) {
		this.hisUser = hisUser;
	}

	public String getHisProcessUuid() {
		return hisProcessUuid;
	}

	public void setHisProcessUuid(String hisProcessUuid) {
		this.hisProcessUuid = hisProcessUuid;
	}

	public String getHisOriginProcessid() {
		return hisOriginProcessid;
	}

	public void setHisOriginProcessid(String hisOriginProcessid) {
		this.hisOriginProcessid = hisOriginProcessid;
	}

	public Integer getSysId() {
		return sysId;
	}

	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}

	public String getHisHistoryEvent() {
		return hisHistoryEvent;
	}

	public void setHisHistoryEvent(String hisHistoryEvent) {
		this.hisHistoryEvent = hisHistoryEvent;
	}

	public String getHisOrginDocId() {
		return hisOrginDocId;
	}

	public void setHisOrginDocId(String hisOrginDocId) {
		this.hisOrginDocId = hisOrginDocId;
	}

	public String getHisDocUuid() {
		return hisDocUuid;
	}

	public void setHisDocUuid(String hisDocUuid) {
		this.hisDocUuid = hisDocUuid;
	}

	public String getHisDocStorageSystem() {
		return hisDocStorageSystem;
	}

	public void setHisDocStorageSystem(String hisDocStorageSystem) {
		this.hisDocStorageSystem = hisDocStorageSystem;
	}

	public Timestamp getHisTimestamp() {
		return hisTimestamp;
	}

	public void setHisTimestamp(Timestamp hisTimestamp) {
		this.hisTimestamp = hisTimestamp;
	}

	public String getHisUserRacf() {
		return hisUserRacf;
	}

	public void setHisUserRacf(String hisUserRacf) {
		this.hisUserRacf = hisUserRacf;
	}

	public String getHisSysName() {
		return hisSysName;
	}

	public void setHisSysName(String hisSysName) {
		this.hisSysName = hisSysName;
	}

	public String getHisProcessStatus() {
		return hisProcessStatus;
	}

	public void setHisProcessStatus(String hisProcessStatus) {
		this.hisProcessStatus = hisProcessStatus;
	}
	
	
	

}
