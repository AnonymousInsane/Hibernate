package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Colleges {
	@Id
	@Column(name = "College_ID")
	private int id;
	@Column(name = "College_Name")
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
	public Colleges(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Colleges() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Colleges [id=" + id + ", name=" + name + "]";
	}
	
}
