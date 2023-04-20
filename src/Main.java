public class Main {

    /*
    Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.
     */

    // Creating a thread1 class from Thread class
    static class MyThread1 extends Thread{
        @Override
       public void run(){
           while(true){
               System.out.println("My Thread is Running");
               System.out.println("I am happy");
           }
       }
    }
    // Creating a Thread 2 from class Thread class
   static class MyThread2 extends Thread{
        @Override
        public void run(){
            while(true){
                System.out.println("Thread 2 is Good");
                System.out.println("I am sad");
            }
        }
    }


  // creating objects from thread1 and thread2 class
    public static void main(String[] args) {
        // creating object of class thread1
        MyThread1 t1 = new MyThread1();
        //creating object of class thread2
        MyThread2 t2 = new MyThread2();
        // calling Start method for both the cerated objects
        t1.start();
        t2.start();
    }
}