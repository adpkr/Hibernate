package com.HibernateDay1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	
        System.out.println( "Project started..." );
        
        
        //shortcut
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        
//        System.out.println(factory);
        
        
        //longcut
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
//        System.out.println(factory);
      
        Student st = new Student();
        st.setSid(17);
        st.setSname("Akash");
        st.setScity("Delhi");
        System.out.println(st);
        
        Session ses = factory.openSession();
        Transaction trans = ses.beginTransaction();
        ses.save(st);
        trans.commit();
        ses.close();
        
        
        
    }
    
    
    
    
    
}
