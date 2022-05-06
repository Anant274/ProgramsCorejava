package MapBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class SortMap {
	public static void main(String []arg)
	{
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(1, "Anant");
		mp.put(2, "ximgit");
		mp.put(5, "kiti");
		mp.put(4, "bitvise");
		
		//for(Map.Entry<Integer, String> en:mp.entrySet());
		{
			//System.out.println(mp);
		}
		
		mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->mp.put(x.getKey(),x.getValue()));
		System.out.println(mp);
		
	}

}
