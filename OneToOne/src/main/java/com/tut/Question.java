package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionID;
	@Column(name = "question")
	private String questionString;
	@OneToOne
	@JoinColumn(name = "answer_id")
	private Answer answer;

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestionString() {
		return questionString;
	}

	public void setQuestionString(String questionString) {
		this.questionString = questionString;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int questionID, String questionString) {
		super();
		this.questionID = questionID;
		this.questionString = questionString;
	}

	public Question(int questionID, String questionString, Answer answer) {
		super();
		this.questionID = questionID;
		this.questionString = questionString;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


}
