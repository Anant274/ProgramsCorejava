package Multithreading.Program;

public class EvenOdd implements Runnable 
{
	public void run() 
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String []arg)
	{
		EvenOdd ev=new EvenOdd();
		
		Thread ti=new Thread(ev);
		ti.start();
		
	}
	
	

}
	

