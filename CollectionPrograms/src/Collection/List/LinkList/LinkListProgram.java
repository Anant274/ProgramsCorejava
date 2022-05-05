package Collection.List.LinkList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkListProgram {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Anant");
		ll.add("Kumar");
		ll.add("Ramganesh");
		ll.add("pandey");
		
		
		
		//System.out.println("10 rupe ki papsi rachna bhabhi sexxy");
		
//		
////		Collections.sort(ll);
//////		Iterator itr=ll.iterator();
//		ll.forEach((LinkListProgram) -> System.out.println(LinkListProgram));
//		
////		while(itr.hasNext())
////		{
////			System.out.println(itr.next());
////		}
		
		
		ll.forEach((LinkListProgram)-> System.out.println(LinkListProgram));
		

	}

}
