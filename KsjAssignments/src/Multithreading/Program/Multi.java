package Multithreading.Program;

public class Multi implements Runnable{
	public void run()
	{
		System.out.println("thread block");
	}
	
	public static void main(String []arg)
	{
		Multi m1=new Multi();
		
		Thread t1=new Thread(m1);
		t1.start();
		System.out.println("thread is running");
	}
	

}
