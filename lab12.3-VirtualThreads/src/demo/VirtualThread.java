package demo;

import java.util.Random;

public class VirtualThread {
  public static void main( String[] args ) {
    boolean vThreads = args.length > 0;
    System.out.println( "Using vThreads: " + vThreads);

    long start = System.currentTimeMillis();

    Random random = new Random();
    Runnable runnable = () -> { double i = random.nextDouble(1000) % random.nextDouble(1000);  };  
    for (int i = 0; i < 50000; i++){
      if (vThreads){ 
        Thread.startVirtualThread(runnable);
      } else {
        Thread t = new Thread(runnable);
        t.start();
      }
    }
   
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;
    System.out.println("Run time: " + timeElapsed);
  }
}