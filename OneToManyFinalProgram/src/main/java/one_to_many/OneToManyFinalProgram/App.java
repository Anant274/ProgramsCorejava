package one_to_many.OneToManyFinalProgram;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("one_to_many/OneToManyFinalProgram/Config.xml");
		SessionFactory fact = cfg.buildSessionFactory();

		Session se = fact.openSession();
		Transaction txn = null;

		try {
			System.out.println("App.main()");
			txn = se.beginTransaction();
			
			Product prod = new Product("electronic", "tv+mobile", 23000.00F);
			
			Category ct1 = new Category("mobile");
			Category ct2 = new Category("tv");
			se.save(ct1);
			se.save(ct2);

			List<Category> cat1 = new ArrayList<Category>();
			cat1.add(ct1);
			cat1.add(ct2);
			prod.setCategory(cat1);
			se.save(prod);

			se.getTransaction().commit();
			se.close();

		} catch (Exception e) {
			txn.rollback();
			System.out.println("record is not inserted");
		}
	}
}
