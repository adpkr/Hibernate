package com.MavenProjectHQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App6 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
		Session sess = factory.openSession();
		
	    Query q= sess.createQuery("select e.eName,e.eAdd,d.dName,d.dSalary from Employe as e INNER JOIN e.dep as d");
		List<Object []> ls= q.getResultList();
		
		System.out.println("__________________________________________________________________________");
		
		for (Object[] objects : ls) {
			System.out.println(Arrays.deepToString(objects));
		}
		System.out.println("___________________________________________________________________________");
		
		
		sess.close();
		factory.close();
		
	}

}
