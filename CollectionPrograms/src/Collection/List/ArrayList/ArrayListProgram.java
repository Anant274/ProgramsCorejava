package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
	
		List<String> li=new ArrayList<String>();
		li.add("Anant");
		li.add("Kumar");
		li.add("pandey");
		
		System.out.println(li.toString());
		
		Collections.reverse(li);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}

}
