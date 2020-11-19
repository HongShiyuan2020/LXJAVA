package Thread;

import compareor.Hero;

public class Tongbuwenti {
    public static void main(String[] args) {
        Hero aHero = new Hero(10000, 2000, "Gernn");

        System.out.println("chushi:" + aHero.hp);

        int n = 1000000;

        Thread[] hitThread = new Thread[n];
        Thread[] coveThreads = new Thread[n];

        for (int i = 0; i < coveThreads.length; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    aHero.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            t.start();
            hitThread[i] = t;
        }

        for (int i = 0; i < coveThreads.length; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    aHero.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            t.start();
            coveThreads[i] = t;
        }

        for (Thread thread : hitThread) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread thread : coveThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(">>>"+aHero.hp);
    }
}
