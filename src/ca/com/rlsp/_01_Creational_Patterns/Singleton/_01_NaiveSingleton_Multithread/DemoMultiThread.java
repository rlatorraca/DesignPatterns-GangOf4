package ca.com.rlsp._01_Creational_Patterns.Singleton._01_NaiveSingleton_Multithread;

import ca.com.rlsp._01_Creational_Patterns.Singleton._01_NaiveSingleton_SingleThreaded.Singleton;

public class DemoMultiThread {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (Thread 01 is ON)" + "\n" +
                "If you see different values, then 2 singletons were created (Thread 02 is ON too)" + "\n\n" +
                "Final RESULT:" );

        Thread thread01 = new Thread(new Thread01());
        Thread thread02 = new Thread(new Thread02());
        thread01.start();
        thread02.start();
    }

    private static class Thread01 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Thread01");
            System.out.println(singleton.someValue);
        }
    }

    private static class Thread02 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Thread02");
            System.out.println(singleton.someValue);
        }
    }
}
