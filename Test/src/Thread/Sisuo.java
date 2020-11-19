package Thread;

import compareor.Hero;

public class Sisuo {
    public static void main(String[] args) {
        Hero aHero = new Hero(1000, 1, "Ahri");
        Hero bHero = new Hero(12, 2, "Anni");

        Thread aThread = new Thread() {
            @Override
            public void run() {
                System.out.println("to get Ahri");
                synchronized (aHero) {
                    System.out.println("getted! a");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("try to get Anni");
                System.out.println("loading...");
                synchronized (bHero){
                    System.out.println("getted! a");
                }
            }
        };
        Thread bThread = new Thread() {
            @Override
            public void run() {
                System.out.println("to get Anni");
                synchronized (bHero) {
                    System.out.println("getted! b");
                }
               
                System.out.println("try to get Ahri");
                System.out.println("loading...");
                synchronized (aHero){
                    System.out.println("getted! b");
                }
            }
        };
        aThread.start();
        bThread.start();
    }
}
