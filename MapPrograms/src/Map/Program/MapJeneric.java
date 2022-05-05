package Map.Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapJeneric {
	public static void main(String []arg)
	{
		Map<Integer,String > ma=new HashMap<Integer, String>();
		
		ma.put(1, "Anant");
		ma.put(2, "kumar");
		ma.put(3, "ramganesh");
		ma.put(4, "pandey");
	
		System.out.println(ma);
		System.out.println("   ");
		
		Iterator<Entry<Integer, String>> itr=ma.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
	    }
		
	}

}
