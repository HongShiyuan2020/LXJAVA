package generic;

import java.util.ArrayList;

import compareor.Hero;

public class TonPeiFu {
    public static void iterate(ArrayList<Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }
 
    public static void iterateAP(ArrayList<APHero> list) {
        for (APHero hero : list) {
            System.out.println(hero.name);
        }
    }
 
    public static void iterateAD(ArrayList<ADHero> list) {
        for (ADHero hero :list) {
            System.out.println(hero.name);
        }
    }

    public static void iterchar(ArrayList<? extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero);
        }
    }
 
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();
        
        iterchar(hs);
        iterchar(aphs);
        iterchar(adhs);


        iterate(hs);
        iterateAP(aphs);
        iterateAD(adhs);
    }
}
