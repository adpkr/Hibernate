package com.MavenProjectHQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App2 {
	
    public static void main(String[] args) {
		
    	SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
    	Session sess = factory.openSession();
    	
    	Query q = sess.createQuery("from Employe where eName = 'Adeep'");
    	Employe ans = (Employe)q.uniqueResult();
    	
    	System.out.println("----------------------------------------------");
    	System.out.println(ans.geteName()+"    "+ans.geteAdd());
    	System.out.println("-----------------------------------------------");
    	
    	sess.close();
    	factory.close();
    	
	}

}
