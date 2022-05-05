package Collection.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main (String []arg)
	{
	Map<Integer, String> ma=new HashMap<>();
	ma.put(1, "Anant");
	ma.put(2, "Kumar");
	ma.put(3, "Pandey");
	
	System.out.println(ma);
	System.out.println();
	
	Iterator<Entry<Integer, String>> itr=ma.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println("values : "+itr.next());
	}
	
	}

}
