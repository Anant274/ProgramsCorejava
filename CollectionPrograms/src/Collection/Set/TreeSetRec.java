package Collection.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRec {
	public static void main(String []arg)
	{
		SortedSet<String> set=new TreeSet<>();
		set.add("anant");
		set.add("kumar");
		set.add("ram");
		set.add("pandey");
		
		System.out.println(set);
		System.out.println("");
		
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Collections.reverse(set);
		System.out.println("");
		
		List<String> se=new ArrayList<String>(set);
		Collections.reverse(se);
		Iterator<String> itr=se.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//System.out.println(se);
		
		
		
		
		
	}

}
