package com.MavenProjectHQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	
    	SessionFactory factory = new Configuration().configure("HibernateQuery.cfg.xml").buildSessionFactory();
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("----------------------------------------------------------------------------");
    	System.out.println("Enter your Employe Id:");
    	int eid = sc.nextInt();
    	
    	System.out.println("Enter your Employe Name:");
    	String ename = sc.next();
    	
    	System.out.println("Enter your Employe Address:");
    	String Add = sc.next();
    	
    	Employe employe = new Employe();
    	employe.seteId(eid);
    	employe.seteName(ename);
    	employe.seteAdd(Add);
    	
    	System.out.println("Enter your Department Id:");
    	int did = sc.nextInt();
    	
    	System.out.println("Enter your Department Name:");
    	String dname = sc.next();
    	
    	System.out.println("Enter your Department Salary:");
    	int dsalary = sc.nextInt();
    	
    	Department dep = new Department();
    	dep.setdId(did);
    	dep.setdName(dname);
    	dep.setdSalary(dsalary);
    	
    	
    	
    	List<Employe> empList = new ArrayList<Employe>();
    	empList.add(employe);
    	List<Department> depList = new ArrayList<Department>();
    	depList.add(dep);
    	
    	employe.setDep(depList);
    	dep.setEmp(empList);
    	
    	System.out.println("-------------------------------------------------------------------------------");
    	
    	Session sess = factory.openSession();
    	Transaction tx = sess.beginTransaction();
    	sess.save(employe);
//    	sess.save(dep);
    	
    	tx.commit();
    	sess.close();
    	factory.close();
    	
    	System.out.println("Inserted Sucessfull................................");
        
    }
}
