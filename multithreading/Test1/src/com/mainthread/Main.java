package com.mainthread;
public class Main {
    public static void main(String[] args) { //main_thread
        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());  //main
        }

        //TO RUN WORLD CLASS METHOD WE NEED TO CREATE ITS OBJECT AND CALL THE START METHOD
        World world=new World();
        world.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());  //main
        }
    }
}