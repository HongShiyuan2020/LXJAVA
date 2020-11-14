package Thread;

import compareor.Hero;

public class SUperThread {
    public static void main(String[] args) {
        Hero aHero = new Hero(1000, 2000, "Mike");
        Hero bHero = new Hero(2000, 1000, "Kai");
        Hero cHero = new Hero(3423, 555, "Dio");
        Hero dHero = new Hero(302, 22324, "Ahri");

        // while (bHero.hp>0&&aHero.hp>0) {
        //     aHero.attac(bHero);
        //     bHero.attac(aHero);
        // }

        System.out.println("/******************************/");

        // KillThresd aKillThresd = new KillThresd(aHero, bHero);
        // aKillThresd.start();
        // KillThresd bKillThresd = new KillThresd(cHero,dHero);
        // bKillThresd.start();
        // while (bHero.hp>0&&aHero.hp>0) {
        //     aKillThresd.start();
        //     bKillThresd.start();
        // }

        // KillHero aKillHero = new KillHero(aHero, bHero);
        // new Thread(aKillHero).start(); 
        // KillHero bKillHero = new KillHero(cHero, dHero);
        // new Thread(bKillHero).start();

        Thread aThread = new Thread(){
            @Override
            public void run() {
                while(bHero.hp>0){
                    aHero.attac(bHero);
                }
            };
        };

        Thread bThread = new Thread(){
            @Override
            public void run() {
                while(dHero.hp>0){
                    cHero.attac(dHero);
                }
            };
        };

        aThread.start();
        bThread.start();
    }
}
