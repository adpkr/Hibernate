package com.MavenProjectHQL;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App5 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter update Department Name:");
		String name = sc.next();
		System.out.println("Enter Department Id:");
		int add = sc.nextInt();
		
		Query q= sess.createQuery("Update Department set dName = :n where dId = :a");
		q.setParameter("n", name);
		q.setParameter("a", add);
		
		int x = q.executeUpdate();
		System.out.println("_________________________________________________________________________");
		System.out.println("Update Employe "+x);
		System.out.println("-------------------------------------------------------------------------");
		
		tx.commit();
		sess.close();
		factory.close();
		
	}

}
