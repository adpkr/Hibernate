package com.MavenProjectHQL;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App7 {
	
	public static void main(String[] args) {
		 
		SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
		Session sess = factory.openSession();
		
		Query q= sess.createQuery("from Employe");
		
		//implement pegination
		
		q.setFirstResult(2);
		q.setMaxResults(3);
		
		List<Employe> ls= q.list();
		
		System.out.println("---------------------------------------------------------------------------------");
		for (Employe employe : ls) {
			System.out.println(employe.geteName()+"        "+employe.geteAdd());
		}
		System.out.println("----------------------------------------------------------------------------------");
		
		sess.close();
		factory.close();
	}

}
