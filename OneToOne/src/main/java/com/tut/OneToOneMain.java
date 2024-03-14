package com.tut;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class OneToOneMain {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToOne");
		EntityManager manager =factory.createEntityManager();
		manager.getTransaction().begin();
		Question question = new Question();
		question.setQuestionID(1);
		question.setQuestionString("What is Java");

		Question question2 = new Question();
		question2.setQuestionID(2);
		question2.setQuestionString("What is python");

		Answer answer = new Answer();
		answer.setAnswerID(5);
		answer.setAnswerString("Java is a programming language");
		answer.setQuestion(question);

		Answer answer2 = new Answer();
		answer2.setAnswerID(6);
		answer2.setAnswerString("Python is interpreted language");
		answer2.setQuestion(question2);

		question.setAnswer(answer);
		question2.setAnswer(answer2);
		manager.persist(question);
		manager.persist(answer);
		manager.persist(question2);
		manager.persist(answer2);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
}
