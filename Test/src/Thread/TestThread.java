package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {
    public static void main(String[] args) {
        Lock aLock = new ReentrantLock();
        Condition aCondition = aLock.newCondition();

        Thread aThread = new Thread() {
            @Override
            public void run() {
                System.out.println("启动线程 " + this.getName());
                aLock.lock();
                System.out.println("占有 alock");
                System.out.println("开始占有 2000ms");
                try {
                    Thread.sleep(2000);
                    aCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("重新占有 lock");
                aLock.unlock();
            }
        };
        aThread.setName("线程1");
        aThread.start();
        Thread bThread = new Thread() {
            @Override
            public void run() {
                System.out.println("启动线程 " + this.getName());
                aLock.lock();
                System.out.println("占有 lock");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                aCondition.signal();
                aLock.unlock();
                System.out.println("唤醒 线程1");
            }
        };
        bThread.setName("t2");
        bThread.start();
    }
}