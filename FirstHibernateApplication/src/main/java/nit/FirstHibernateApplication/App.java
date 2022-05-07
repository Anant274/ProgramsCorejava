package nit.FirstHibernateApplication;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import nit.FirstHibernateApplication.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        
        Configuration cfg=new Configuration();
        cfg.configure("nit/FirstHibernateApplication/config/Config.xml");
        SessionFactory fact=cfg.buildSessionFactory();
        
        Session se=fact.openSession();
        Transaction txn=null;
        
        try {
        	txn=se.beginTransaction();
        	Student st=new Student();
        	
        	st.setId(1);
        	st.setName("anant");
        	
        	se.save(st);
        	txn.commit();
        	System.out.println("data is saved in mysql");
			
		} catch (Exception e) {
			txn.rollback();
			System.out.println("record is not inserted");
		}
          
    }
    
    
}
