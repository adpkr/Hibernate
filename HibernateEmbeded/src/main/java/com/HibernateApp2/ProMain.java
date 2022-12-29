package com.HibernateApp2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProMain {

	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		
		config.configure("Embaded.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Product p = new Product();
		p.setProductId(1);
		p.setProductName("Headphone");
		p.setProductPrice(500);
		p.setProductExp("2 Years");
		
		Company c = new Company();
		c.setCompanyName("Boat");
		c.setCompanyAddress("Banglore");
		
		p.setCom(c);
		
		System.out.println(p);
		
		Session sess =  factory.openSession();
		Transaction trans = sess.beginTransaction();
		sess.save(p);
		trans.commit();
		
		sess.close();
		factory.close();
		

	}

}
