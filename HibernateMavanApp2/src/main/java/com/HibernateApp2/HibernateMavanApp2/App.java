package com.HibernateApp2.HibernateMavanApp2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	
    public static void main( String[] args ){
    	
    	SessionFactory factory = new Configuration().configure("hibernateApp2.cfg.xml").buildSessionFactory();
    	
    	System.out.println(factory);
    	System.out.println("Connected...");
    	
    	Product p = new Product();
    	p.setProductId(1);
    	p.setProductName("Truck");
    	p.setProductPrice(1500000);
    	p.setProductQuantity(1);
    	
    	System.out.println(p);
    	
    	Session sess = factory.openSession();
    	
    	Transaction trans = sess.beginTransaction();
    	sess.save(p);
    	trans.commit();
    	sess.close();
    	
        
    }
}
