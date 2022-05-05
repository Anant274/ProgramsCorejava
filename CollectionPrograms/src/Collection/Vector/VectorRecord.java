package Collection.Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorRecord {
	public static void main(String []arg)
	{
		Vector<String> ve=new Vector<String>();
		ve.add("anant");
		ve.add("kumar");
		ve.add("Ramganesh");
		ve.add("Pandey");
		ve.add("hello");
		
		System.out.println(ve);
		System.out.println(" ");
		
		Collections.sort(ve);
		Iterator<String> itr=ve.iterator() ;
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("");
		
		Collections.reverse(ve);
		Iterator<String> itr1=ve.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	
		
	}

}
