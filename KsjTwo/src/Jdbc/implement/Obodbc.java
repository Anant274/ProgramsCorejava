package Jdbc.implement;

import java.sql.*;  

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class Obodbc {
	
	
	
	static final String DB_URL = "jdbc:mysql://localhost:3307/ksj";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT *  FROM empolyee";

	public static void main (String arg[])	
	
	{
		
		
		
		
		
		
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         // Execute a query
		         System.out.println("Inserting records into the table...");          
		         String sql = "INSERT INTO empolyee VALUES (2, 'Zara',  1800)";
		         stmt.executeUpdate(sql);
		        
		         System.out.println("Inserted records into the table...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   
		
		
		
		
		
		
		
		
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery(QUERY);
		      ) {		      
		         while(rs.next()){
		            //Display values
		            System.out.print("ID: " + rs.getInt("id"));
		            System.out.print(", Age: " + rs.getString("name"));
		            System.out.print(", First: " + rs.getInt("salary"));
		           
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   }
		
		/*Connection conn = null;
		try {
		    // db parameters
		    String url       = "jdbc:mysql://localhost:3307/ksj";
		    String user      = "root";
		    String password  = "";
		    final String QUERY = "SELECT id, name, salary, FROM empolyee";
			
		    // create a connection to the database
		    conn = DriverManager.getConnection(url, user, password);
		    // more processing here
		    System.out.println("connection done successfull");
		    
		    
		    while(rs.next()){
	            //Display values
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(", Age: " + rs.getInt("age"));
	            System.out.print(", First: " + rs.getString("first"));
	            System.out.println(", Last: " + rs.getString("last"));



		    // ...	
		} catch(SQLException e) {
		   System.out.println(e.getMessage());
		} finally {
			try{
		           if(conn != null)
		             conn.close();
			}catch(SQLException ex){
		           System.out.println(ex.getMessage());
			}
		}*/
		
		
		
		
		/*
		
		ArrayList<Objdbc> emp = new ArrayList<Objdbc>();
		emp.add(new Objdbc (1,"Anant",2000));
		emp.add(new Objdbc (3,"kumar",3000));
		emp.add(new Objdbc (5,"ram",4000));
		emp.add(new Objdbc (2,"ganesh",2000));
		emp.add(new Objdbc (9,"pandey",3000));
		emp.add(new Objdbc (4,"gadhar",4000));
		emp.add(new Objdbc (7,"prasad",2000));
		emp.add(new Objdbc (8,"ramanujan",3000));
		emp.add(new Objdbc (6,"Euphoria",4000));
		emp.add(new Objdbc (10,"Anastasia",2000));
		
		Iterator<Objdbc>i=emp.iterator();
		
		System.out.println("");
    	System.out.println("Wethout sorting the records==================================================");  
        System.out.println("");

	    while(i.hasNext())  
        {  
	    	  
        System.out.println(i.next());  
        }  
	    System.out.println("");
	    System.out.println("Afrer  sorting the Id records===============================================");  
        System.out.println("");
        
	    Collections.sort(emp, Collections.reverseOrder());
             //Collections.sort(emp);
	         //Iterator<Employ>j=emp.iterator();
	    i=emp.iterator();
	    while(i.hasNext())  
        {  
	    	
        System.out.println(i.next());  
        }  
	    
	    
	    
	   /* Collections.sort(emp);
	    i=emp.iterator();
	    while(i.hasNext())  
        {  
	    	 System.out.println("After Sorting : " + i.next());	
        //System.out.println(i.next());  
        }  
        // printing the sorted ArrayList
	    Collections.sort(emp, Collections.reverseOrder());  
	  //printing ArrayList after sorting  
	  System.out.println("");
	  System.out.println("After Sorting name Records :"); 
	  System.out.println("");
	  Iterator<Employ>k=emp.iterator();
	    while(k.hasNext())  
      {  
	    	
      System.out.println(k.next());  
      }  
	  
	  //System.out.println(i);
	   * */ 
	    
	    
	    
	  
	    
	    
	    
	
	//}

}
