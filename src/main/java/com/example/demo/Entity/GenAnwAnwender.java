package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GenAnwAnwender {
	
	@Id
	@Column
	private int anwId;
	
	@Column
	private String anwRacf;
	
	@Column
	private String anwEmail;
	
	@Column
	private String anwName;
	
	@Column
	private String anwVorname;
	
	
	@Column
	private String anwEmployeeNr;
	
	@Column
	private String anwCompanyId;
	
	@Column
	private String anwVcdGid;
	
	@Column
	private int anwIsDeleteable;
	
	@Column
	private int anwIsTester;

	public int getAnwId() {
		return anwId;
	}

	public void setAnwId(int anwId) {
		this.anwId = anwId;
	}

	public String getAnwRacf() {
		return anwRacf;
	}

	public void setAnwRacf(String anwRacf) {
		this.anwRacf = anwRacf;
	}

	public String getAnwEmail() {
		return anwEmail;
	}

	public void setAnwEmail(String anwEmail) {
		this.anwEmail = anwEmail;
	}

	public String getAnwName() {
		return anwName;
	}

	public void setAnwName(String anwName) {
		this.anwName = anwName;
	}

	public String getAnwVorname() {
		return anwVorname;
	}

	public void setAnwVorname(String anwVorname) {
		this.anwVorname = anwVorname;
	}

	public String getAnwEmployeeNr() {
		return anwEmployeeNr;
	}

	public void setAnwEmployeeNr(String anwEmployeeNr) {
		this.anwEmployeeNr = anwEmployeeNr;
	}

	public String getAnwCompanyId() {
		return anwCompanyId;
	}

	public void setAnwCompanyId(String anwCompanyId) {
		this.anwCompanyId = anwCompanyId;
	}

	public String getAnwVcdGid() {
		return anwVcdGid;
	}

	public void setAnwVcdGid(String anwVcdGid) {
		this.anwVcdGid = anwVcdGid;
	}

	public int getAnwIsDeleteable() {
		return anwIsDeleteable;
	}

	public void setAnwIsDeleteable(int anwIsDeleteable) {
		this.anwIsDeleteable = anwIsDeleteable;
	}

	public int getAnwIsTester() {
		return anwIsTester;
	}

	public void setAnwIsTester(int anwIsTester) {
		this.anwIsTester = anwIsTester;
	}
	
	
	

}
