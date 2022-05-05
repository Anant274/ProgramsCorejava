package Collection.List.LinkList;

import java.util.LinkedList;
import java.util.List;

public class ListGetSet {

	public static void main(String[] args) {
		
		List<String> al=new LinkedList<String>();
		al.add("Anant");
		al.add("kumar");
		al.add("Ramganesh");
		al.add("Pandey");
		
		System.out.println("get a 2nd element : "+al.get(2));
		
		System.out.println();
		
		System.out.println("set the new value in 2nd : "+al.set(2, "pitamah"));
		
		System.out.println();
		
		System.out.println(al);
		
		
		
		
		
	

	}

}
