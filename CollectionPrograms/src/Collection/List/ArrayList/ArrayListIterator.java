package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

	public static void main(String[] args) {
//		List<String> li=new ArrayList<String>();
//		li.add("anant");
//		li.add("kumar");
//		li.add("ramganesh");
//		li.add("pandey");
//		System.out.println(li);
//		System.out.println("");
//		
//		Iterator itr=li.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		List<String> lii=new ArrayList<String>();
		lii.add("anant");
		lii.add("kumar");
		lii.add("ramganesh");
		lii.add("pandey");
		
		Collections.sort(lii);
		Iterator<String> itr=lii.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("");
		
		Collections.reverse(lii);
		Iterator<String>  li=lii.iterator() ;
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
	}

}
