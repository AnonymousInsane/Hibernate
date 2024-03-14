package com.tut;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cascading");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Boys boys = new Boys();
		boys.setId(2);
		boys.setName("Shyamu");
		
		Games games = new Games();
		games.setId(3);
		games.setName("Volleyball");
		games.setBoys(boys);
		
		Games games2 = new Games();
		games2.setId(4);
		games2.setName("Kho-Kho");
		games2.setBoys(boys);
		
		List<Games> g = new ArrayList<Games>();
		g.add(games);
		g.add(games2);
		boys.setGames(g);
		
		
		manager.persist(boys);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
