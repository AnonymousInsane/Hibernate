package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Student");
		EntityManager manager = factory.createEntityManager();
		QSPStudent student = manager.find(QSPStudent.class, 1);
		System.out.println(student.getNameString()+" "+student.getCityString()+" "+student.getMobile_num());
		manager.close();
		factory.close();
	}
}
