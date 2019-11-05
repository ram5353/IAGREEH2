package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GenScSystemConfig {
	
	
	@Id
	@Column
	private Integer scId;
	
	@Column
	private Integer anwId;
	
	@Column
	private Integer sysId;

	public Integer getScId() {
		return scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	public Integer getAnwId() {
		return anwId;
	}

	public void setAnwId(Integer anwId) {
		this.anwId = anwId;
	}

	public Integer getSysId() {
		return sysId;
	}

	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}
	

}
