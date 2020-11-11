package LamataTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Lianxi3 {
    public static void main(String[] args) {
        insertFirst(ArrayList::new,"arraylist");
        insertFirst(LinkedList::new, "linked");
    }
  
    private static void insertFirst(Supplier<List<Integer>> l, String type) {
    
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.get().add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }
}
