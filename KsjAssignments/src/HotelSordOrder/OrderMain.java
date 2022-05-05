package HotelSordOrder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OrderMain {
	public static void main(String []arg)
	{
		ArrayList<Order> list=new ArrayList<Order>();
		
		list.add(new Order("A01","C1",new Date(System.currentTimeMillis()-100)));
		list.add(new Order("A02","C1",new Date(System.currentTimeMillis()-50)));
		list.add(new Order("A01","C3",new Date(System.currentTimeMillis()-100)));
		list.add(new Order("A03","C1",new Date(System.currentTimeMillis()-30)));
		list.add(new Order("A02","C2",new Date(System.currentTimeMillis()-50)));
		
		
		Map<String, Order> orderMap=new LinkedHashMap<>();
		for(Order ord:list)
		{
			Order o=orderMap.get(ord.getOrderId());
		
		if(o == null|| ord.getDate().after(ord.getDate()))
		{
			orderMap.put(ord.getOrderId(), ord);
		}
		}
		
		
		Set<String> order1=orderMap.keySet();
		for(String s:order1) {
			System.out.println(orderMap.get(s).toString());
		}
		System.out.println(orderMap);
		
	}
}

	
	
