package com.runnable;

public class MainByRunnable {
    public static void main(String[] args) { //main_thread

        //TO RUN WORLD CLASS METHOD-:
        //--->WE NEED TO CREATE THREAD CLASS OBJECT AND CALL THE START METHOD BY ITS OBJECT
        World world=new World();
        Thread t1=new Thread(world);
        t1.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello");
            //System.out.println(Thread.currentThread().getName());  //main
        }
    }
}