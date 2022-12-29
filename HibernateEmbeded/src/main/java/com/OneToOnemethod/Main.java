package com.OneToOnemethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		config.configure("Embaded.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		
		
		Question q= new Question();
		q.setQuestionId(1);
		q.setQuestion("What is Java ?");
		
		Answer a = new Answer();
		a.setAnswerId(12);
		a.setAnswer("Java is a Programing langauge.");
		a.setQuestion(q);
		
		q.setAns(a);
		
		
		
		
		Session sess = factory.openSession();
		Transaction trans = sess.beginTransaction();
		sess.save(q);
		sess.save(a);
		trans.commit();
		
		
		Question que = (Question) sess.get(Question.class, 1);
		System.out.println(que.getQuestion());
		System.out.println(que.getAns().getAnswer());
	
		
		sess.close();
		factory.close();

	}

}
