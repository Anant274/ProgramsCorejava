package Collection.Set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetReco  {
	public static void main(String []arg)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Anant");
		hs.add("Kumar");
		hs.add("Ramganesh");
		hs.add("Pandey");
		
		System.out.println("all values : "+hs);
		
		System.out.println("");
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("");
		
		List<String> li=new ArrayList<String>(hs);
		Collections.sort(li);
		Iterator<String> itr1=li.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}

}
