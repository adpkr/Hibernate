package com.HibernateAppOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	
	@Id
	private int answerId;
	private String answer;
	
	@ManyToOne
	private Questions que;

	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int answerId, String answer, Questions que) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.que = que;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQue() {
		return que;
	}

	public void setQue(Questions que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + ", que=" + que + "]";
	}
	
	

}
