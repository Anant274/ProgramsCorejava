package Month.Program;

public class DateIdentify {
	public static void main(String []arg)
	{
		int arr[]= {31,59,90,120,151,181,212,243,273,304,334,365};
		
		int date=0;
		String month="";
		int day=90;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(day<=arr[0])
			{
				month="jan";
				date=day;
			}
			else if(day>arr[0]&&day<=arr[1])
			{
				month="feb";
				date=day-arr[0];
			}
			else if(day>arr[1]&&day<=arr[2])
			{
				month="mar";
				date=day-arr[1];
				
			}
			else if(day>arr[2]&&day<=arr[3])
			{
				month="april";
				date=day-arr[2];
				
			}
			else if(day>arr[3]&&day<=arr[4])
			{
				month="may";
				date=day-arr[3];
				
			}
			else if(day>arr[4]&&day<=arr[5])
			{
				month="june";
				date=day-arr[4];
				
			}
			else if(day>arr[5]&&day<=arr[6])
			{
				month="july";
				date=day-arr[5];
				
			}
			else if(day>arr[6]&&day<=arr[7])
			{
				month="august";
				date=day-arr[6];
				
			}
			else if(day>arr[7]&&day<=arr[8])
			{
				month="sept";
				date=day-arr[7];
				
			}
			else if(day>arr[8]&&day<=arr[9])
			{
				month="oct";
				date=day-arr[8];
				
			}
			else if(day>arr[9]&&day<=arr[10])
			{
				month="nove";
				date=day-arr[9];
				
			}
			else if(day>arr[10]&&day<=arr[11])
			{
				month="dec";
				date=day-arr[10];
				
			}
			
			else 
				month = "bhai kya kar raha hai tu";
			
				
		}
		System.out.println(date+" "+month);
		
		
	}

}
