package LamataTest;

import java.util.ArrayList;
import java.util.Collections;

import compareor.Hero;

public class Lianxi1 {
    public static void construct(ArrayList<Hero> arrayList,int n) {
        for (int i = 0; i < n; i++) {
            arrayList.add(new Hero((int)(Math.random()*500+100), (int)(Math.random()*1000+500), "Hero-"+i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Hero> arrayList = new ArrayList<>();
        construct(arrayList,50);
        
        Collections.sort(arrayList,Lianxi1::getvalue);

        System.out.println(arrayList);
    }
    public static int getvalue(Hero h1,Hero h2) {
        return h1.hp-h2.hp;
    }

}
