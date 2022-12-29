package com.MavenProjectHQL.HQLhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
        System.out.println( "Project Start....." );
        
        SessionFactory factory = new Configuration().configure("Hql.cfg.xml").buildSessionFactory();
        
        Student s = new Student();
        s.setSid(12);
        s.setSname("Ankit");
        s.setSmarks(600);
        
        Session sess = factory.openSession();
        Transaction tx = sess.beginTransaction();
        
        sess.save(s);
        tx.commit();
        
        sess.close();
        factory.close();
        
        System.out.println("Done...............");
        
    }
}
