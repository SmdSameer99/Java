// RunnableExample.java
// Demonstrates important concepts to learn for Runnable in Java

// 1. Implementing Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable!");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // 2. Creating a Thread with Runnable
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        // 3. Runnable with Lambda Expression (Java 8+)
        Runnable lambdaRunnable = () -> System.out.println("Thread with lambda Runnable!");
        Thread t2 = new Thread(lambdaRunnable);
        t2.start();

        // 4. Anonymous Runnable implementation
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread with anonymous Runnable!");
            }
        });
        t3.start();
    }
}

// Key points to learn:
// - Runnable interface and its run() method
// - Creating threads using Runnable
// - Lambda expressions with Runnable (Java 8+)
// - Anonymous inner classes for Runnable
// - Difference between extending Thread and implementing Runnable
