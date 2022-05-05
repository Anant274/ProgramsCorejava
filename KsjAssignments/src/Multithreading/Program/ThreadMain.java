package Multithreading.Program;

public class ThreadMain {
	public static void main(String arg[])
	{
		try {
			    for(int i=0;i<5;i++)
				{
					Thread.sleep(500);
					System.out.println(i);
			    	
				}
			
		} catch (Exception e) {
			System.out.println(e);
		}
//		
	}

}
