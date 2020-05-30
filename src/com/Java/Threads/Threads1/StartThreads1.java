package com.Java.Threads.Threads1;

public class StartThreads1 {
    public static void main(String[] args) throws InterruptedException  {
        System.out.println("Беспорядочное исполнение.");
        for (int i = 0; i < 5; i++) {
            MyFirstThread thread = new MyFirstThread();
            MySecondThread thread2 = new MySecondThread();
            MyThirdThread thread3 = new MyThirdThread ();
            thread.start();
            thread2.start();
            thread3.start();
        }

        Thread.sleep(1000);
        System.out.println("\nУпорядочное исполнение.");
        for (int i = 0; i < 5; i++) {
            MyFirstThread thread = new MyFirstThread();
            MySecondThread thread2 = new MySecondThread();
            MyThirdThread thread3 = new MyThirdThread ();

            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            thread3.start();
            try {
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}