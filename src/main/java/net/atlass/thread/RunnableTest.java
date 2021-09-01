package net.atlass.thread;

public class RunnableTest {
    public static void main(String[] args) {
        Myrunn myrunn = new Myrunn();
        Myrunn2 myrunn2 = new Myrunn2();

        Thread t1 = new Thread(myrunn2);
        Thread t2 = new Thread(myrunn);
        Thread t3 = new Thread(myrunn);

        Thread at1 = new Thread(myrunn2);
        Thread at2 = new Thread(myrunn2);
        Thread at3 = new Thread(myrunn2);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");
        at1.setName("a线程1");
        at2.setName("a线程2");
        at3.setName("a线程3");

        t1.start();
        t2.start();
        t3.start();

        at1.start();
        at2.start();
        at3.start();
    }

    static class Myrunn implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 2 ==0){
                    System.out.println(Thread.currentThread().getName()+": ==0 "+i);
                }
            }
        }
    }

    static class Myrunn2 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 2 !=0){
                    System.out.println(Thread.currentThread().getName()+": !=0 "+i);
                }
            }
        }
    }
}
