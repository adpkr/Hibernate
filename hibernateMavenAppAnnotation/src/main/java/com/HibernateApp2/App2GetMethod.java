package com.HibernateApp2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2GetMethod {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernateAnnotation.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session sess = factory.openSession();
		
		StudentAddress sa = (StudentAddress)sess.get(StudentAddress.class, 2);
		System.out.println(sa);
		
		StudentAddress s = (StudentAddress)sess.load(StudentAddress.class, 1);
		System.out.println(s.getStreet());
		
		sess.close();
		factory.close();
		
	}

}
