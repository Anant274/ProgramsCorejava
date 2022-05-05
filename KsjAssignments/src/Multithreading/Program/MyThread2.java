package Multithreading.Program;

public class MyThread2 implements Runnable {
	public void run()
	{
		System.out.println("that is a thread block");
	}
	public static void main(String []arg)
	{
		Runnable r1=new MyThread2();
		
		Thread t1=new Thread(r1,"anant");
			
		t1.run();
		String str=t1.getName();
		System.out.println(str);
			
	}

}
