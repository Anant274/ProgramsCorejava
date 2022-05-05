package NewHotelSordOrder;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lstatus {
	public static void main(String []arg)
	{
		ArrayList<Hotel> ar=new ArrayList<>();
		ar.add(new Hotel("A01","C1",new Date(System.currentTimeMillis()-100)));
		ar.add(new Hotel("A01","C1",new Date(System.currentTimeMillis()-50)));
		ar.add(new Hotel("A02","C2",new Date(System.currentTimeMillis()-86)));
		ar.add(new Hotel("A01","C1",new Date(System.currentTimeMillis()-67)));
		
		Map<String, Hotel> so=new LinkedHashMap<String, Hotel>();
		for(Hotel ho:ar)
		{
			Hotel h=so.get(ho.getOid());
			
			if(h==null || h.getDate().after(h.getDate()));
			{
				so.put(ho.getOid(), h);
				
			}	
		}
		
		Set<String> st=so.keySet();
		for(String s:st)
		{
			System.out.println(so.get(s).toString());
		}
		
		System.out.println(so);
		
		
	}

}
