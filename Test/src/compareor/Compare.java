package compareor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Compare {
    public static void main(String[] args) {
        List<Hero> tHeros = new ArrayList<>(); 
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            tHeros.add(new Hero(r.nextInt(999), r.nextInt(999), "Hero-"+r.nextInt(20)));
        }

        System.out.println(tHeros);

        Comparator<Hero> testcComparator = new Comparator<Hero>(){
            @Override
            public int compare(Hero h1,Hero h2){
                if (h1.hp >= h2.hp) {
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(tHeros,testcComparator);

        System.out.println(tHeros);
    }
}
