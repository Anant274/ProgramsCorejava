package Map.Program;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapNonGeneric {
	public static void main(String []arg)
	{
		HashMap ma=new HashMap();
		ma.put(1, "anant");
		ma.put(2, "kumar");
		ma.put(3, "ramganesh");
		ma.put(4, "pandey");
		
		
		ma.entrySet().forEach(entry -> {
		    System.out.println(((Entry) entry).getKey() + " " + ((Entry) entry).getValue());
		});
		
//		System.out.println(ma);
//		System.out.println("");
//		
//		
//		
//		Set set=ma.entrySet();
//		Iterator st=set.iterator();
//		while(st.hasNext())
//		{
//			Map.Entry entry=(Map.Entry)st.next();
//			
//			System.out.println("");
//			
//			System.out.println("value is"+entry.getKey()+"and value is "+entry.getValue());
//			
//			System.out.println(st.next());
//		}
		
		
		
		
		
		
		
		
	}

}
