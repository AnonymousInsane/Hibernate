package com.tut;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Boys {
	@Id
	@Column(name = "Boys_ID")
	private int id;
	@Column(name = "Boy_Name")
	private String name;
	@OneToMany(mappedBy = "boys",cascade = CascadeType.ALL)
	
	private List<Games> games;

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

	public List<Games> getGames() {
		return games;
	}

	public void setGames(List<Games> games) {
		this.games = games;
	}

	public Boys(int id, String name, List<Games> games) {
		super();
		this.id = id;
		this.name = name;
		this.games = games;
	}

	public Boys() {
		super();
		// TODO Auto-generated constructor stub
	}

}
