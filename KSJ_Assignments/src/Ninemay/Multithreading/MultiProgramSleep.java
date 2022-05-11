//program for sleep method
package Ninemay.Multithreading;

public class MultiProgramSleep implements Runnable{
    Thread t;

    @Override
    public void run() {
        for (int i=0;i<2;i++)
        {

            //System.out.println("hello anant");
            System.out.println(Thread.currentThread().getName()+""+i);
            try {
                Thread.sleep(100);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t=new Thread(new MultiProgramSleep());
        t.start();

        Thread t2=new Thread(new MultiProgramSleep());
        t2.start();

    }



}
