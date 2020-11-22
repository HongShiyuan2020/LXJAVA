package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atom {

    static int val = 0;
    static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        int num = 100;
        Thread[] t1 = new Thread[num];
        for (int i = 0; i < t1.length; i++) {
            Thread tt1 = new Thread() {
                @Override
                public void run() {
                    val++;
                    // System.out.println(val+"<<");
                }
            };
            tt1.start();
            t1[i] = tt1;
        }

        for (Thread thread : t1) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("\n%d个线程结束后val=%d",num,val);
        System.out.println("*********************************************");
        System.out.println(atomicInteger.intValue());
        Thread[] t2 = new Thread[num];
        for (int i = 0; i < t1.length; i++) {
            Thread tt2 = new Thread() {
                @Override
                public void run() {
                    atomicInteger.incrementAndGet();
                    // System.out.println(atomicInteger.get()+">>>");
                }
            };
            tt2.start();
            t2[i] = tt2;
        }

        for (Thread thread : t2) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("\n***%d个线程结束后val=%d\n",num,atomicInteger.intValue());

    }
}
