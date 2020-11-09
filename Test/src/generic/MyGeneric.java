package generic;

import java.util.HashSet;

public class MyGeneric {
    HashSet<Number> myHashSet = new HashSet<>();
    public static void main(String[] args) {
        MyGeneric aGeneric = new MyGeneric();
        aGeneric.myHashSet.add(1);
        aGeneric.myHashSet.add(1.02);
        aGeneric.myHashSet.add(1.0f);
        aGeneric.myHashSet.add(12);
        System.out.println(aGeneric.myHashSet);
    }
}
