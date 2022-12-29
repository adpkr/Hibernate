package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("OneToMany.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		
		
		List<Employe> EmpList = new ArrayList<Employe>();
		List<Project> ProList = new ArrayList<Project>();
		
		Employe e = new Employe();
		e.setEmpId(14);
		e.setEmpName("Prakash");
		
		Employe e2 = new Employe();
		e2.setEmpId(21);
		e2.setEmpName("Pramesh");
		
		Project p = new Project();
		p.setProId(31);
		p.setProName("Bank System...");
		
		Project p2 = new Project();
		p2.setProId(26);
		p2.setProName("Hotel System...");
		
		EmpList.add(e);
		EmpList.add(e2);
		ProList.add(p);
		ProList.add(p2);
		
		e.setProject(ProList);
		p2.setEmp(EmpList);
		
		Session sess = factory.openSession();
		Transaction tran = sess.beginTransaction();
		sess.save(e);
		sess.save(p2);
		tran.commit();
		
		Employe ansE = (Employe) sess.get(Employe.class, 1);
		
		System.out.println("-----------------------------------------------");
//		System.out.println(ansE.getEmpName());
//		System.out.println(ansE.getProject().size());
//		for(Project a : ansE.getProject()) {
//			System.out.println(a.getProName());
//		}
		
		System.out.println("------------------------------------------------");
		
		sess.close();
		
		factory.close();
		
	}

	

}
