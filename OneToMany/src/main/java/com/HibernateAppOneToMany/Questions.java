package com.HibernateAppOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Questions {
	
	@Id
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy = "que")
	private List<Answers> ans;

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int questionId, String question, List<Answers> ans) {
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

	public List<Answers> getAns() {
		return ans;
	}

	public void setAns(List<Answers> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", ans=" + ans + "]";
	}


	
	

}
