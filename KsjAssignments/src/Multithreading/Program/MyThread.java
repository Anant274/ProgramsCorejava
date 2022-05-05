package Multithreading.Program;

public class MyThread {
	public static void main(String arg[])
	{
		Thread t=new Thread("hello this is thread");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
