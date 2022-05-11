package Ninemay.Multithreading;

public class MultiProgramJoin implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Current thread name : " + t.getName());

        System.out.println("Is Alive : " + t.isAlive());
    }

    public static void main(String[] args) throws Exception {
        Thread t=new Thread(new MultiProgramJoin());
        t.start();
        t.join(1000);

        System.out.println("\n joining after 100 : "+"miliseconds : \n");
        System.out.println("Current thread name :"+t.getName());

        System.out.println("is alive ? :"+t.isAlive());

    }
    }

