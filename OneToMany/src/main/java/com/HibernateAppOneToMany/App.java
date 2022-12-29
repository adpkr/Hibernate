package com.HibernateAppOneToMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
    public static void main( String[] args ){
    	
    	Configuration config= new Configuration();
    	config.configure("OneToMany.cfg.xml");
    	SessionFactory factory= config.buildSessionFactory();
    	
    	
    	Questions q = new Questions();
    	
    	q.setQuestionId(1);
    	q.setQuestion("What is Java ?");
    	
    	Answers a1 = new Answers();
    	a1.setAnswerId(12);
    	a1.setAnswer("java is the programing langauge.");
    	a1.setQue(q);
    	
    	Answers a2 = new Answers();
    	a2.setAnswerId(13);
    	a2.setAnswer("java is most used by busnies companyes.");
    	a2.setQue(q);
    	
    	Answers a3 = new Answers();
    	a3.setAnswerId(14);
    	a3.setAnswer("java belongs to opps conscepts.");
    	a3.setQue(q);
    	
        List<Answers> ls= new ArrayList<Answers>();
        ls.add(a1);
        ls.add(a2);
        ls.add(a3);
        
        q.setAns(ls);
        
        
        Session sess = factory.openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(q);
        sess.save(a1);
        sess.save(a2);
        sess.save(a3);
        trans.commit();
        
        
        Questions qans =  (Questions)sess.get(Questions.class, 1);
        System.out.println(qans.getQuestion());
        
        for(Answers a : q.getAns()) {
        	System.out.println(a.getAnswer());
        }
        
    	sess.close();
    	factory.close();
      
    }
}
