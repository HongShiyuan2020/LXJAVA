package Thread;

import java.util.LinkedList;

public class ThreadPool {
    LinkedList<Runnable> tasks = new LinkedList<Runnable>();

    public ThreadPool() {
        synchronized(tasks){
            for (int i = 0; i < 10; i++) {
                new InnerThreadPool("Thread-"+i).start();
                System.out.println("启动线程-"+i);
            }
        }
    }

    public void add(Runnable e) {
        synchronized(tasks){
            tasks.add(e);
            tasks.notifyAll();
        }
    }


    /**
     * InnerThreadPool
     */
    class InnerThreadPool extends Thread {
        public InnerThreadPool(String name) {
            super(name);
        }
        Runnable task;

        @Override
        public void run() {
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            System.out.println("Thread "+this.getName()+" creat failed!!!!!!!!!!");
                        }
                    }
                    task = tasks.removeLast();
                    tasks.notifyAll();
                }
                System.out.println(this.getName()+"start to run task 执行了");
                task.run();
            }
        }
    }
}