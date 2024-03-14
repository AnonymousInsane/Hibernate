package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Pegination {
	@Id
	@Column(name = "Student_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Student_Name")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pegination(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Pegination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
