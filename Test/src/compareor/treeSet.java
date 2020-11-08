package compareor;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        
        Comparator<Integer> aComparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer i1,Integer i2){
                if (i1 >= i2) {
                    return -1;
                }else{
                    return 1;
                }
            }
        };

        TreeSet<Integer> aSet = new TreeSet<>(aComparator);
        for (int i = 0; i < 10; i++) {
            aSet.add(i);
        }

        System.out.println(aSet);
    }
}
