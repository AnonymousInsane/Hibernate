package com.tut;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Games {
	@Id
	@Column(name = "Game_ID")
	private int id;
	@Column(name = "Game_Name")
	private String name;
	@ManyToOne
	private Boys boys;

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

	public Boys getBoys() {
		return boys;
	}

	public void setBoys(Boys boys) {
		this.boys = boys;
	}

	public Games(int id, String name, Boys boys) {
		super();
		this.id = id;
		this.name = name;
		this.boys = boys;
	}

	public Games() {
		super();
		// TODO Auto-generated constructor stub
	}

}
