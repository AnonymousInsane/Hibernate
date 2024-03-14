package com.tut;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ManyToMany");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Employee employee = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee.seteId(101);
		employee.setNameString("Ram");

		employee2.seteId(102);
		employee2.setNameString("Shyam");
		
		employee3.seteId(103);
		employee3.setNameString("Sundar");

		Projects projects = new Projects();
		Projects projects2 = new Projects();
		Projects projects3 = new Projects();
		Projects projects4 = new Projects();

		projects.setpId(201);
		projects.setNameString("Library Management System");

		projects2.setpId(202);
		projects2.setNameString("Chatbot");
		
		projects3.setpId(203);
		projects3.setNameString("Ecom website");
		
		projects4.setpId(204);
		projects4.setNameString("School Management");

		List<Employee> liEmployees = new ArrayList<Employee>();
		List<Projects> liProjects = new ArrayList<Projects>();
		List<Projects> liProjects1 = new ArrayList<Projects>();

		liEmployees.add(employee);
		liEmployees.add(employee2);
		liEmployees.add(employee3);
		liProjects.add(projects);
		liProjects1.add(projects2);
		liProjects.add(projects3);
		liProjects1.add(projects4);
		
		employee.setProjects(liProjects);
		employee2.setProjects(liProjects1);
		projects.setEmployees(liEmployees);
		projects2.setEmployees(liEmployees);
		
		manager.persist(employee);
		manager.persist(employee2);
		manager.persist(projects);
		manager.persist(projects2);
		manager.persist(projects3);
		manager.persist(projects4);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}
}
