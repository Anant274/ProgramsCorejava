package Multithreading.Program;

public class ThreadSleep extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {Thread.sleep(500);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	
	public static void main(String []a)
	{
		ThreadSleep t1= new ThreadSleep();
		ThreadSleep t2=new ThreadSleep();
		
		t1.start();
		t2.start();
	}
	
}
