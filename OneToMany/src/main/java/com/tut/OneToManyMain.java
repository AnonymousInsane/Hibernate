package com.tut;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyMain {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToMany");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		 QuestionOneToMany question = new QuestionOneToMany();
		question.setQuestionID(1);
		question.setQuestionString("What is Java?");
		
		AnswersOneToMany answers = new AnswersOneToMany();
		answers.setAnswerID(5);
		answers.setAnswerString("Java is a programming language");
		answers.setQuestion(question);
		
		AnswersOneToMany answers2 = new AnswersOneToMany();
		answers2.setAnswerID(6);
		answers2.setAnswerString("Java is compiled and interpreted language");
		answers2.setQuestion(question);
		
		List<AnswersOneToMany> ans = new ArrayList<AnswersOneToMany>();
		
		ans.add(answers);
		ans.add(answers2);
		question.setAnswers(ans);
		
		manager.persist(question);
		manager.persist(answers);
		manager.persist(answers2);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
