package Thread;

import compareor.Hero;

public class KillHero implements Runnable{

    Hero h1,h2;
    @Override
    public void run() {
        while (h2.hp>0) {
            h1.attac(h2);
        }

    }

    public KillHero(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }
    
}
