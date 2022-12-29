package com.MavenProjectHQL;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App4 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Delete Employe Id:");
		int id = sc.nextInt();
		
		
		Query q= sess.createQuery("delete from Employe where eId = :x");
		q.setParameter("x", id);
		int a= q.executeUpdate();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(" Deleted Employe Id:"+a);
		System.out.println("--------------------------------------------------------------------------");
		
		tx.commit();
		sess.close();
		factory.close();
		
	}

}
