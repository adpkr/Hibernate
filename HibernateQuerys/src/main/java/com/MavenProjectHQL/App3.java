package com.MavenProjectHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App3 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
		
		Session sess = factory.openSession();
		
		Query q =  sess.createQuery("from Employe");
		List<Employe> ls =  q.list();
		
		System.out.println("--------------------------------------------------------------------");
		for (Employe employe : ls) {
			System.out.println(employe.geteName()+"   "+employe.geteAdd()+"   "+employe.geteId());
		}
		System.out.println("--------------------------------------------------------------------");
		
		
		//First level cache
		//here your will not fire that is first level cache it is use only in session objects. 
		
		System.out.println("First level cache...............");
		for (Employe e1 : ls) {
			System.out.println(e1.geteName());
		}
		
		sess.close();
		factory.close();
	}

}
