package com.HibernateApp2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	
    public static void main( String[] args ) throws IOException{
    	
    	SessionFactory factory = new Configuration().configure("hibernateAnnotation.cfg.xml").buildSessionFactory();
    	
    	StudentAddress sd = new StudentAddress();
    	sd.setStreet("Dhurwa");
    	sd.setCity("Ranchi");
    	sd.setOpen(true);
    	sd.setAddDate(new Date());
    	sd.setX(2314.34);
    	
    	//reading image
    	
    	FileInputStream fil = new FileInputStream("src\\main\\java\\Screenshot (1).png");
    	byte[] data = new byte[fil.available()];
    	fil.read(data);
    	sd.setImage(data);
    	
    	
    	System.out.println(sd);
    	
    	Session sess = factory.openSession();
    	Transaction trans = sess.beginTransaction();
    	sess.save(sd);
    	trans.commit();
    	sess.close();
    	
    	
    	System.out.println("Done....!");
    	
       
    }
}
