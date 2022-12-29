package ManyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main2 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("OneToMany.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		
		Session sess = factory.openSession();
		
		
		//Q1
//		String query = "from Employe";

		//One entity fatching.....
		
//		Query ans = sess.createQuery(query);
//		Employe emp =  (Employe) ans.uniqueResult();
//		System.out.println(emp.getEmpName());

		
		
		//--------------------------------------------------------------------------------//
		
		
		
		
		//more then one fatching.....
		
//		Query q= sess.createQuery(query);
//		List<Employe>ls= q.list();
//		for(Employe a : ls) {
//			System.out.println(a.getEmpName());
//		}
		
		
		
		
		//-------------------------------------------------------------------//
		
		//where clouse:-
		
//		String query = "from Employe where empId = 4";
//
//		//One entity fatching.....
//		
//		Query ans = sess.createQuery(query);
//		Employe emp =  (Employe) ans.uniqueResult();
//		System.out.println(emp.getEmpName());
//----------------------------------------------------------------------------------------		
		
//		String query = "from Employe where empId =: x";
//
//		//One entity fatching.....
//		
//		Query ans = sess.createQuery(query);
//		ans.setParameter("x", 4);
//		Employe emp =  (Employe) ans.uniqueResult();
//		System.out.println(emp.getEmpName());
		
		
//----------------------------------------------------------------------------------------		
		
		String query = "from Employe as e where e.empId =: x and e.empName = :n";
		
			//One entity fatching.....
				
		Query ans = sess.createQuery(query);
		ans.setParameter("x", 4);
		ans.setParameter("n", "Akash");
		Employe emp =  (Employe) ans.uniqueResult();
		System.out.println(emp.getEmpName());
		
		sess.close();
		factory.close();

	}

}
