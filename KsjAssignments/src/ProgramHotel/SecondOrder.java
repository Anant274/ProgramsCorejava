package ProgramHotel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class SecondOrder {
	
	public static void main(String []arg)
	
	{
		
		/*
		List<OneOrder> order= new ArrayList<OneOrder>();
		
		order.add(new OneOrder(12, "c1","2020-03-24"));
		order.add(new OneOrder(12, "c5","2020-02-25"));
		order.add(new OneOrder(12, "c3","2020-01-26"));
		order.add(new OneOrder(13, "c1","2019-05-27"));
		order.add(new OneOrder(12, "c5","2020-03-28"));
		
		Iterator<OneOrder> it=order.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("");
		Collections.sort(order,Collections.reverseOrder());
		Iterator<OneOrder> it1=order.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
        
		*/
		
//===================================================================================================
		
		
List<OneOrder> order= new ArrayList<OneOrder>();
		
		order.add(new OneOrder(12, "c1","2020-03-24"));
		order.add(new OneOrder(12, "c5","2020-02-25"));
		order.add(new OneOrder(12, "c3","2020-01-26"));
		order.add(new OneOrder(13, "c1","2019-05-27"));
		order.add(new OneOrder(12, "c5","2020-03-28"));
		
		Iterator<OneOrder> it=order.iterator();
		 System.out.println("");
		 System.out.println("ArrayList Values");
		 System.out.println("");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("");
		 System.out.println("");
		 System.out.println("ArrayList Values After sorting");
		 System.out.println("");
		Collections.sort(order,Collections.reverseOrder());
		Iterator<OneOrder> it1=order.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
	System.out.println("=========================================================================");	
		
		
	 		System.out.println("");
	 		System.out.println("HashSet Values");
	 		System.out.println("");
	 		Set<OneOrder> se = new HashSet (order);
	 		for (OneOrder value : se) 
			 {
		            System.out.println(value);
			
			 }
		    
			 
			
			 System.out.println("");
			 System.out.println("HashSet Values after sorting");
			 System.out.println(""); 
	         Collections.sort(order,Collections.reverseOrder());
	         for(OneOrder o: order)
	         {
	       	  System.out.println(o);
	       	  
	         }
		
		
		
		
		
		
//===================================================================================================
		
		
		 /*   
		List<String> st = new ArrayList<String>();
		st.add("2020-03-24");
		st.add("2020-02-24");
		st.add("2020-01-27");
		st.add("2021-03-24");
		st.add("2020-01-28");
		st.add("2019-03-24");
		st.add("2018-06-24");
		st.add("2017-01-24");
		st.add("2020-08-24");
		
		System.out.println(st);
		System.out.println("");
		
		Collections.sort(st);
		Iterator<String>it=st.iterator();
		while(it.hasNext())
			{
				System.out.println(it.next());
			}
		System.out.println("======");
		
		*/
		
	 
//===================================================================================================
		
		
		/*
		ArrayList<DateRe> ord = new ArrayList<DateRe>();
		
		ord.add(new DateRe("2017-02-26"));
		ord.add(new DateRe("2020-05-2"));
		ord.add(new DateRe("2020-03-25"));
		ord.add(new DateRe("2019-01-27"));
		ord.add(new DateRe("1998-01-27"));
		ord.add(new DateRe("1999-02-26"));
		
		
        System.out.println(ord);
        System.out.println("");
        Collections.sort(ord, new DateInter());
        //Collections.sort(ord, new DateRe());
        
        
        System.out.println("Sorted in Ascending Order");
        System.out.println("");
        for (DateRe d : ord)
        System.out.println(d.date);
        */
		//ok
       
       
//===================================================================================================

	
         /*
		Set<OneOrder> se = new HashSet (order);
		 for (OneOrder value : se)
			 {
		            System.out.println(value);
			
			 }
			 
			 System.out.println("");
	          Collections.sort(order,Collections.reverseOrder());
	          
	          
	         for(OneOrder o: order)
	         {
	       	  System.out.println(o);
	       	  
	         }
	         */
		
		
//===================================================================================================
	
	
        
        /*
        order.sort((d1,d2) -> d1.compareTo(d2));
        System.out.println("The Object after sorting is : " 
                           + order);
        */
		
		/*
         
		List<String> st2 = new ArrayList<String>();
		st2.add("2020-03-24");
		st2.add("2020-02-24");
		st2.add("2020-01-27");
		st2.add("2021-03-24");
		st2.add("2020-01-28");
		st2.add("2019-03-24");
		st2.add("2018-06-24");
		st2.add("2017-01-24");
		st2.add("2020-08-24");
		
		System.out.println(st2);
		System.out.println("");
		
		Collections.sort(st2);
		Iterator<String> it=st2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("======");
		*/
		
		
		
		
	/*	
		
	
          */
		
	}
}


