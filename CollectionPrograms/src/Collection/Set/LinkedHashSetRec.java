package Collection.Set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetRec {

	public static void main(String[] args) {
	
	LinkedHashSet<String> st=new LinkedHashSet<>();
	st.add("Anant");
	st.add("kumar");
	st.add("ramganesh");
	st.add("pandey");
	
	
	System.out.println(st);
	
	List<String> set=new ArrayList<String>(st);
	
	Collections.sort(set);
	Iterator<String>  itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println();
	
	
	
		
	}

}
