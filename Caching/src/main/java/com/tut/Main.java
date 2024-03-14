package com.tut;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("caching");
	EntityManager manager = factory.createEntityManager();
//	manager.getTransaction().begin();
//	Colleges colleges = new Colleges();
//	colleges.setId(2);
//	colleges.setName("NIT Patna");
//	manager.persist(colleges);
//	manager.getTransaction().commit();
	
	Colleges colleges =manager.find(Colleges.class, 1);
	System.out.println(colleges);
	System.out.println("Working......");
	Colleges colleges1=manager.find(Colleges.class, 1);
	System.out.println(colleges1);
	manager.close();
	factory.close();
}
}
