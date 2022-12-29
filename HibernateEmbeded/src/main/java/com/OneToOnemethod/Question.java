package com.OneToOnemethod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int questionId;
	
	@Column(name = "Question")
	private String question;
	
	@OneToOne
	@JoinColumn(name = "Answer_Id")
	private Answer ans;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, Answer ans) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.ans = ans;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", ans=" + ans + "]";
	}
	
	

}
