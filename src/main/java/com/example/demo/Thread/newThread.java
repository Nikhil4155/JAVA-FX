package com.example.demo.Thread;

class A extends Thread{
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

class B extends Thread{
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

public class newThread {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        System.out.println(obj1.getPriority());
//        System.out.println(obj2.getPriority());
//        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();

        try{
            obj1.join();
            obj2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
