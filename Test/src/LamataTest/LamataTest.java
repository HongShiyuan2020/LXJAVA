package LamataTest;


import java.util.ArrayList;
import java.util.List;

import compareor.Hero;

public class LamataTest {
    public static void main(String[] args) {
        Hero aHero = new Hero(100, 500, "temo");
        Hero bHero = new Hero(198, 500, "gareen");
        Hero cHero = new Hero(456, 500, "loko");
        Hero dHero = new Hero(146, 500, "miku");
        ArrayList<Hero> arrayList = new ArrayList<>(); 
        arrayList.add(aHero);
        arrayList.add(bHero);
        arrayList.add(cHero);
        arrayList.add(dHero);

        // Herochecker a = new Herochecker(){
        //     @Override
        //     public boolean test(Hero h) {
        //         if (h.hp > 100) {
        //             return true;
        //         }else{
        //             return false;
        //         }
        //     }
        // };
        getheros(arrayList,h-> h.hp > 100);
    }

    public static void getheros(List<Hero> a,Herochecker c) {
        for (Hero hero : a) {
            if (c.test(hero)) {
                System.out.println(hero.name);
            }
        }
    }
}
