package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GenVgVorgang {
	
	@Id
	@Column
	private Integer vgId;
	
	@Column
	private String vgUuid;
	
	@Column
	private String vgAntwortUrl;
	
	@Column
	private String vgStatus;
	
	@Column
	private String vgBegruendung;
	
	@Column
	private Date vgVerfallsdatum;
	
	@Column
	private Integer vgGenehmiger;
	
	@Column
	private Date vgEingestelltAm;
	
	@Column
	private Integer sysId;
	
	@Column
	private Date vgErtelltAm;
	
	@Column
	private Integer vgAusgewaehlt;
	
	@Column
	private String vgProcessid;
	
	@Column
	private Date vgErstelltInQuelleAm;
	
	@Column
	private Integer vgReasonFieldLength;
	
	@Column
	private Integer vgUserMapped;
	
	@Column
	private Integer lastUpdatedClientId;
	
	@Column
	private Integer vgExecId;
	
	@Column
	private String vgSystemName;

	public Integer getVgId() {
		return vgId;
	}

	public void setVgId(Integer vgId) {
		this.vgId = vgId;
	}

	public String getVgUuid() {
		return vgUuid;
	}

	public void setVgUuid(String vgUuid) {
		this.vgUuid = vgUuid;
	}

	public String getVgAntwortUrl() {
		return vgAntwortUrl;
	}

	public void setVgAntwortUrl(String vgAntwortUrl) {
		this.vgAntwortUrl = vgAntwortUrl;
	}

	public String getVgStatus() {
		return vgStatus;
	}

	public void setVgStatus(String vgStatus) {
		this.vgStatus = vgStatus;
	}

	public String getVgBegruendung() {
		return vgBegruendung;
	}

	public void setVgBegruendung(String vgBegruendung) {
		this.vgBegruendung = vgBegruendung;
	}

	public Date getVgVerfallsdatum() {
		return vgVerfallsdatum;
	}

	public void setVgVerfallsdatum(Date vgVerfallsdatum) {
		this.vgVerfallsdatum = vgVerfallsdatum;
	}

	public Integer getVgGenehmiger() {
		return vgGenehmiger;
	}

	public void setVgGenehmiger(Integer vgGenehmiger) {
		this.vgGenehmiger = vgGenehmiger;
	}

	public Date getVgEingestelltAm() {
		return vgEingestelltAm;
	}

	public void setVgEingestelltAm(Date vgEingestelltAm) {
		this.vgEingestelltAm = vgEingestelltAm;
	}

	

	public Date getVgErtelltAm() {
		return vgErtelltAm;
	}

	public void setVgErtelltAm(Date vgErtelltAm) {
		this.vgErtelltAm = vgErtelltAm;
	}

	

	public Date getVgErstelltInQuelleAm() {
		return vgErstelltInQuelleAm;
	}

	public void setVgErstelltInQuelleAm(Date vgErstelltInQuelleAm) {
		this.vgErstelltInQuelleAm = vgErstelltInQuelleAm;
	}

	public Integer getVgReasonFieldLength() {
		return vgReasonFieldLength;
	}

	public void setVgReasonFieldLength(Integer vgReasonFieldLength) {
		this.vgReasonFieldLength = vgReasonFieldLength;
	}

	public Integer getVgUserMapped() {
		return vgUserMapped;
	}

	public void setVgUserMapped(Integer vgUserMapped) {
		this.vgUserMapped = vgUserMapped;
	}

	public Integer getLastUpdatedClientId() {
		return lastUpdatedClientId;
	}

	public void setLastUpdatedClientId(Integer lastUpdatedClientId) {
		this.lastUpdatedClientId = lastUpdatedClientId;
	}

	public Integer getVgExecId() {
		return vgExecId;
	}

	public void setVgExecId(Integer vgExecId) {
		this.vgExecId = vgExecId;
	}

	public String getVgSystemName() {
		return vgSystemName;
	}

	public void setVgSystemName(String vgSystemName) {
		this.vgSystemName = vgSystemName;
	}

	public Integer getSysId() {
		return sysId;
	}

	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}

	public Integer getVgAusgewaehlt() {
		return vgAusgewaehlt;
	}

	public void setVgAusgewaehlt(Integer vgAusgewaehlt) {
		this.vgAusgewaehlt = vgAusgewaehlt;
	}

	public String getVgProcessid() {
		return vgProcessid;
	}

	public void setVgProcessid(String vgProcessid) {
		this.vgProcessid = vgProcessid;
	}
	
	
	

}
