package com.HibernateApp2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
    public static void main( String[] args ){
    	
    	
    	Configuration config = new Configuration();
    	config.configure("Embaded.cfg.xml");
    	SessionFactory factory = config.buildSessionFactory();
    	
    	Student s = new Student();
    	s.setStudentId(7);
    	s.setStudentName("Adeep");
    	s.setStudentAddress("Banglore");
    	
    	StudentCertificate sc = new StudentCertificate();
        sc.setCourse("Hibernate");
        sc.setDuration("15 Days");
    	
    	s.setCerti(sc);
    	
    	Session sess = factory.openSession();
    	
    	Transaction trans = sess.beginTransaction();
    	sess.save(s);
    	
    	trans.commit();
    	
    	sess.close();
    	factory.close();
       
    }
}
