package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_id")
	private int answerID;
	@Column(name = "answer")
	private String answerString;
	@OneToOne(mappedBy = "answer")
	private Question question;

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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(int answerID, String answerString) {
		super();
		this.answerID = answerID;
		this.answerString = answerString;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


}
