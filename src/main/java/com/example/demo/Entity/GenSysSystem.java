package com.example.demo.Entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GenSysSystem {
	
	@Id
	@Column
	private Integer sysId;
	
	@Column
	private String sysName;
	
	@Column
	private String sysUsername;

	@Column
	private String sysPassword;

	@Column
	private Blob sysIcon;
	
	@Column
	private Integer sysCallback;
	
	@Column
	private String sysServicetype;
	
	@Column
	private String sysEndpointUrl;
	
	@Column
	private String sysSoapheaderSystem;
	
	@Column
	private String sysSoapheaderCountry;
	
	@Column
	private String sysSoapheaderBrand;

	@Column
	private String sysSoapheaderStage;

	@Column
	private String sysSoapBasicAuthUser;
	
	@Column
	private String sysSoapBasicAuthPw;

	@Column
	private String sysSoapheaderUser;
	
	@Column
	private String sysKumsGroup;
	
	@Column
	private Integer sysEmployeeNrNeeded;
	
	@Column
	private String sysGidNeeded;
	
	@Column
	private String sysIsFixName;

	public Integer getSysId() {
		return sysId;
	}

	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getSysUsername() {
		return sysUsername;
	}

	public void setSysUsername(String sysUsername) {
		this.sysUsername = sysUsername;
	}

	public String getSysPassword() {
		return sysPassword;
	}

	public void setSysPassword(String sysPassword) {
		this.sysPassword = sysPassword;
	}

	public Blob getSysIcon() {
		return sysIcon;
	}

	public void setSysIcon(Blob sysIcon) {
		this.sysIcon = sysIcon;
	}

	public Integer getSysCallback() {
		return sysCallback;
	}

	public void setSysCallback(Integer sysCallback) {
		this.sysCallback = sysCallback;
	}

	public String getSysServicetype() {
		return sysServicetype;
	}

	public void setSysServicetype(String sysServicetype) {
		this.sysServicetype = sysServicetype;
	}

	public String getSysEndpointUrl() {
		return sysEndpointUrl;
	}

	public void setSysEndpointUrl(String sysEndpointUrl) {
		this.sysEndpointUrl = sysEndpointUrl;
	}

	public String getSysSoapheaderSystem() {
		return sysSoapheaderSystem;
	}

	public void setSysSoapheaderSystem(String sysSoapheaderSystem) {
		this.sysSoapheaderSystem = sysSoapheaderSystem;
	}

	public String getSysSoapheaderCountry() {
		return sysSoapheaderCountry;
	}

	public void setSysSoapheaderCountry(String sysSoapheaderCountry) {
		this.sysSoapheaderCountry = sysSoapheaderCountry;
	}

	public String getSysSoapheaderBrand() {
		return sysSoapheaderBrand;
	}

	public void setSysSoapheaderBrand(String sysSoapheaderBrand) {
		this.sysSoapheaderBrand = sysSoapheaderBrand;
	}

	public String getSysSoapheaderStage() {
		return sysSoapheaderStage;
	}

	public void setSysSoapheaderStage(String sysSoapheaderStage) {
		this.sysSoapheaderStage = sysSoapheaderStage;
	}

	public String getSysSoapBasicAuthUser() {
		return sysSoapBasicAuthUser;
	}

	public void setSysSoapBasicAuthUser(String sysSoapBasicAuthUser) {
		this.sysSoapBasicAuthUser = sysSoapBasicAuthUser;
	}

	public String getSysSoapBasicAuthPw() {
		return sysSoapBasicAuthPw;
	}

	public void setSysSoapBasicAuthPw(String sysSoapBasicAuthPw) {
		this.sysSoapBasicAuthPw = sysSoapBasicAuthPw;
	}

	public String getSysSoapheaderUser() {
		return sysSoapheaderUser;
	}

	public void setSysSoapheaderUser(String sysSoapheaderUser) {
		this.sysSoapheaderUser = sysSoapheaderUser;
	}

	public Integer getSysEmployeeNrNeeded() {
		return sysEmployeeNrNeeded;
	}

	public void setSysEmployeeNrNeeded(Integer sysEmployeeNrNeeded) {
		this.sysEmployeeNrNeeded = sysEmployeeNrNeeded;
	}

	public String getSysGidNeeded() {
		return sysGidNeeded;
	}

	public void setSysGidNeeded(String sysGidNeeded) {
		this.sysGidNeeded = sysGidNeeded;
	}

	public String getSysIsFixName() {
		return sysIsFixName;
	}

	public void setSysIsFixName(String sysIsFixName) {
		this.sysIsFixName = sysIsFixName;
	}

	public String getSysKumsGroup() {
		return sysKumsGroup;
	}

	public void setSysKumsGroup(String sysKumsGroup) {
		this.sysKumsGroup = sysKumsGroup;
	}
	
	

}
