package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Student");
	EntityManager manager =factory.createEntityManager();
	manager.getTransaction().begin();
	QSPStudent student = new QSPStudent();
	student.setId(1);
	student.setNameString("Ram");
	student.setMobile_num(52458741);
	student.setCityString("Kolkata");
	
	manager.persist(student);
	manager.getTransaction().commit();
	manager.close();
	factory.close();
}
}
