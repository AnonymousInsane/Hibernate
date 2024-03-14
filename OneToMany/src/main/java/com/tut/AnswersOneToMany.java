package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class AnswersOneToMany {
	@Id
	@Column(name = "answer_id")
	private int answerID;
	@Column(name = "answer")
	private String answerString;
	
	@ManyToOne
	private QuestionOneToMany question;

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public String getAnswerString() {
		return answerString;
	}

	public void setAnswerString(String answerString) {
		this.answerString = answerString;
	}

	public QuestionOneToMany getQuestion() {
		return question;
	}

	public void setQuestion(QuestionOneToMany question2) {
		this.question = question2;
	}

}
