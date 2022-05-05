package Multithreading.Program;

public class ThreadRunnable implements Runnable {
	public void run() 
	{
		System.out.println("this is run method");
	}
	
	public static void main(String []arg)
	{
		Runnable r1=new MyThread2();
		
		Thread t1=new Thread(r1,"kumar");
		t1.run();
		
		String str=t1.getName();
		System.out.println(str);
		
	}

}
