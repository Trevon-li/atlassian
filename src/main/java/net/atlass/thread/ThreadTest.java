package net.atlass.thread;

public class ThreadTest {
    public static void main(String[] args) {
        myThread m1 = new myThread();
        myThread2 m2 = new myThread2();
        m1.start();
        m2.start();

    }

    static class myThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 2 ==0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }
    }

    static class myThread2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }
    }
}
