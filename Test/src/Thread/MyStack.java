package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyStack<T> extends ReentrantLock{
    T val;
    MyStack<T> next;
    MyStack<T> temp = this;

    public MyStack(T val) {
        this.val = val;
    }

    public void add(T e) {
        if (temp.val == null) {
            temp.val = e;
            return;
        }
        if (temp.next == null) {
            temp.next = new MyStack<T>(e);
            return;
        } else {
            temp = temp.next;
            add(e);
        }
        temp = this;
    }

    public void out() {
        MyStack<T> a = this;
        System.out.print("[");

        while (a.val != null) {
            System.out.print(a.val + "->");
            if (a.next == null) {
                break;
            }
            a = a.next;
        }
        System.out.print("\b \b\b]");
    }

    public void del() {
        if (temp.val == null) {
            return;
        }
        if (temp.next == null) {
            temp.val = null;
        }
        if (temp.next.next == null) {
            temp.next = null;
            return;
        } else {
            temp = temp.next;
            del();
        }
        temp = this;
    }

   
    public static void main(String[] args) {
        MyStack<Integer> aMyStack = new MyStack<Integer>(1);
        Condition aCondition = aMyStack.newCondition();
        Thread aThread = new Thread() {
            @Override
            public void run() {
                System.out.println("启动 " + this.getName());
                aMyStack.lock();
                System.out.println(this.getName()+"占有 aMyStack");
                try {
                    Thread.sleep(2000);
                    aCondition.await();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("重新占有 aMyStack");
                aMyStack.unlock();
            }
        };
        aThread.setName("t1");
        aThread.start();

        Thread bThread = new Thread() {
            @Override
            public void run() {
                System.out.println("启动 " + this.getName());
                aMyStack.lock();
                System.out.println(this.getName()+"占有 aMyStack");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                aCondition.signal();
                aMyStack.unlock();
            }
        };
        bThread.setName("t2");
        bThread.start();

    }   
}
