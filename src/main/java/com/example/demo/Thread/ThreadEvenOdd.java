package com.example.demo.Thread;

class OddSumThread extends Thread {
    private int sum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) { // Generate odd numbers
            sum += i;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }

    public int getSum() {
        return sum;
    }
}

class EvenSumThread extends Thread {
    private int sum = 0;

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) { // Generate even numbers
            sum += i;
        }
        System.out.println("Sum of even numbers: " + sum);
    }

    public int getSum() {
        return sum;
    }
}

public class ThreadEvenOdd {
    public static void main(String[] args) {
        // Create thread instances
        OddSumThread oddThread = new OddSumThread();
        EvenSumThread evenThread = new EvenSumThread();

        // Start threads
        oddThread.start();
        evenThread.start();

        try {
            // Wait for threads to finish using join()
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Calculate total sum
        int totalSum = oddThread.getSum() + evenThread.getSum();
        System.out.println("Total sum of odd and even numbers: " + totalSum);
    }
}
