package ProgramHotel;

import java.util.Comparator;

public class DateInter implements Comparator<DateRe> {

	@Override
	public int compare(DateRe a, DateRe b) 
	{
		 return a.date.compareTo(b.date);
		
	}

}
