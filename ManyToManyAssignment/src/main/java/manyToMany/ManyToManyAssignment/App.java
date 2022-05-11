package manyToMany.ManyToManyAssignment;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println( "Hello World!" );
        
        Configuration cfg= new Configuration();
		  cfg.configure("manyToMany/ManyToManyAssignment/configration.xml");
		  
		  SessionFactory factory= cfg.buildSessionFactory();
		  
		  Session session= factory.openSession();
		  
		  Transaction txn=null;
		  
		  try {
			  txn= session.beginTransaction();
			  Question q1=new Question();
			  q1.setId(1);
			  q1.setQno(1);
			  q1.setQcontent("canYou");
			 
			  Answer a=new Answer();
			  a.setId(1);
			  a.setAno(1);
			  
			  List<Question> li=new ArrayList<Question>();
			  List<Answer> lis=new ArrayList<Answer>();
			  li.add(q1);
			  lis.add(a);
			  
			  q1.setAnswer(lis);
			  a.setQuestion(li);
			  
			  session.save(q1);
			  session.save(a);
			  System.out.println("Data is saved into db");
		      txn.commit();
			
		} catch (Exception e) {
			 e.printStackTrace();		  
		}
		  session.close();
		  factory.close();
		}
		         
    }

