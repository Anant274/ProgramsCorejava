package Book.BookRecordHibernateApplication;

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
    public static void main( String[] args )
    {
        
    	Configuration cfg=new Configuration();
        cfg.configure("Book/BookRecordHibernateApplication/Config.xml");
        SessionFactory fact=cfg.buildSessionFactory();
        
        Session se=fact.openSession();
        Transaction txn=null;
        
        try {
        	System.out.println("App.main()");
        	txn=se.beginTransaction();
        	Author at = new Author( "XYZ");
        	
        	se.persist(at);
        	Book book = new Book("mrutunjay", "karna");
             book.setAuthor(at);
             se.persist(book);
        	txn.commit();
        	System.out.println("data is saved in mysql");
			
		} catch (Exception e) {
			txn.rollback();
			System.out.println("record is not inserted");
		}
            
      
        
        
        
    }
}
