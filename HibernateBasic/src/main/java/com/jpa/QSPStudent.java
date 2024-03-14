package com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QSPStudent {
	@Id
	private int id;
	@Column(name = "name")
	private String nameString;
	private int mobile_num;
	@Column(name = "city")
	private String cityString;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(int mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public QSPStudent(int id, String nameString, int mobile_num, String cityString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.mobile_num = mobile_num;
		this.cityString = cityString;
	}
	public QSPStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
