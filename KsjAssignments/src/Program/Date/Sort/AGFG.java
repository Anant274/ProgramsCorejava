package Program.Date.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class AGFG {
	
	public static void main(String args[])
    {
		
        ArrayList<ADateItem> dateList = new ArrayList<>();
 
     
        dateList.add(new ADateItem("2020-03-25"));
        dateList.add(new ADateItem("2019-01-27"));
        dateList.add(new ADateItem("1998-01-27"));
        dateList.add(new ADateItem("1998-02-26"));
 
     
        Collections.sort(dateList, new AsortItems());
 
      
        System.out.println("Sorted in Ascending Order");
 
      
        for (ADateItem d : dateList) {
 
         
            System.out.println(d.date);
        }
    }
	
	
	
	

}
