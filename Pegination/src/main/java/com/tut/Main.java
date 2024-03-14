package com.tut;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pegination");
		EntityManager manager = factory.createEntityManager();
		Session session = manager.unwrap(Session.class);
//		Pegination pegination  = new Pegination();
//		pegination.setNameString("YZ");
//		manager.getTransaction().begin();
//		manager.persist(pegination);
//		manager.getTransaction().commit();
//		Query query = session.createQuery("from Pegination");
//		query.setFirstResult(0);
//		query.setMaxResults(3);
//		List<Pegination> list = query.getResultList();
//		for (Pegination pegination : list) {
//			System.out.println(pegination.getId()+" "+pegination.getNameString());
//		}
		Query query = session.createQuery("update Pegination set name=:n where id=:i");
		query.setParameter("n", "Ankit");
		query.setParameter("i", 1);
		manager.getTransaction().begin();
		int n=query.executeUpdate();
		System.out.println(n);
		manager.getTransaction().commit();
		session.close();
		manager.close();
		factory.close();
	}

}
