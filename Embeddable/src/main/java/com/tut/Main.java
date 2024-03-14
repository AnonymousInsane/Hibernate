package com.tut;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Embeddable");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Ankit");
		student.setCity("Bhagalpur");
		Certificate certificate = new Certificate();
		certificate.setCourseString("Hibernate");
		certificate.setDurationString("15 Days");
		student.setCertificate(certificate);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Aman");
		student2.setCity("Bhagalpur");
		Certificate certificate1 = new Certificate();
		certificate1.setCourseString("DSA");
		certificate1.setDurationString("2 months");
		student2.setCertificate(certificate1);
		
		manager.persist(student);
		manager.persist(student2);
	
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
