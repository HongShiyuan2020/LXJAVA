package Thread;

import compareor.Hero;

public class KillThresd extends Thread{
    private Hero h1,h2;

    public KillThresd(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run() {
        while (h2.hp>0) {
            h1.attac(h2);            
        }
    }

}
