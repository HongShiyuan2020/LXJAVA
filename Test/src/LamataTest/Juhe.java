package LamataTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Juhe {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            a.add(i);
        }
        a
            .stream()
            .forEach(h-> System.out.println(h));
        System.out.println("**************************************");
        int [] b = new int[50];
        for (int i = 0;i < b.length;i++) {
            b[i] = i;
        }
        Arrays.stream(b)
            .forEach(i->System.out.println(i));
    }
}   
