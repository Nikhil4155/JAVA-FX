package com.example.demo.Thread;

class C implements Runnable{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class D implements Runnable{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class newThreadRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new C();
        Runnable obj2 = new D();

//        System.out.println(obj1.getPriority());
//        System.out.println(obj2.getPriority());
//        obj1.setPriority(Thread.MAX_PRIORITY);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();





    }
}
