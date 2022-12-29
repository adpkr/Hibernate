package com.HibernateApp2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App3 {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernateAnnotation.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		StudentAddress sd = (StudentAddress)s.get(StudentAddress.class, 2);
		
		System.out.println(sd);
		
		StudentAddress sd2 = (StudentAddress)s.load(StudentAddress.class, 1);
		System.out.println(sd2);
		
		
		
		s.close();
		factory.close();
	}

}
