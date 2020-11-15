package LamataTest;

import java.util.ArrayList;
import java.util.Arrays;

import compareor.Hero;

public class Lianxi4 {
    public static void main(String[] args) {
        ArrayList<Hero> arrayList = new ArrayList<>();
        Lianxi2.construct(arrayList, 10);
        Object[] hs = arrayList
            .stream()
            .sorted((h1,h2)-> h2.hp-h1.hp)
            .toArray();
            System.out.println(Arrays.toString(hs));
            System.out.println(hs[2]);
            
    }
}
