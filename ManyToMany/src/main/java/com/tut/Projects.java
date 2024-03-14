package com.tut;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {

	@Id
	private int pId;
	@Column(name = "project_name")
	private String nameString;

	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Projects(int pId, String nameString, List<Employee> employees) {
		super();
		this.pId = pId;
		this.nameString = nameString;
		this.employees = employees;
	}

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

}
