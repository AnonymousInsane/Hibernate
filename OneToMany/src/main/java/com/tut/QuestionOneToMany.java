package com.tut;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class QuestionOneToMany {
	@Id
	@Column(name = "question_id")
	private int questionID;
	@Column(name = "question")
	private String questionString;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	private List<AnswersOneToMany> answers;

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

	
	public List<AnswersOneToMany> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswersOneToMany> answers) {
		this.answers = answers;
	}

	public QuestionOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}
}
