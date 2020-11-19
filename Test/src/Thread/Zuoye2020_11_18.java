package Thread;

import compareor.Hero;

public class Zuoye2020_11_18 {
    public static void main(String[] args) {
        Hero aHero = new Hero(1998, 2333, "Temo");

        Thread aThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                        
                    
                    aHero.recover();
                    System.out.println(aHero.hp + ">");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread bThread = new Thread() {
            @Override
            public void run() {
               
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                    aHero.hurt();
                    System.out.println(aHero.hp + ">");
                }
                
            }
        };
        aThread.start();
        bThread.start();
        
    }
}
