package com.tut;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class HQL {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hql");
	EntityManager manager=factory.createEntityManager();
	//manager.getTransaction().begin();
//	Chairs chairs = new Chairs();
//	chairs.setName("HP");
//	chairs.setPrice(1000);
//	manager.persist(chairs);
	String qString = "from Chairs";
	List<Chairs> chairs2=manager.createQuery(qString).getResultList();
	for (Chairs ch : chairs2) {
		System.out.println(ch);
	}
	//manager.getTransaction().commit();
	manager.close();
factory.close();	
}
}
