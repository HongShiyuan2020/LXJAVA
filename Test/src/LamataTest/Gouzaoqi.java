package LamataTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Gouzaoqi {
    public static void main(String[] args) {
        Supplier<List> aSupplier = new Supplier<List>(){
            public List get() {
                return new ArrayList<>();
            }
        };
        List list1 = getList(aSupplier);

        List list2 = getList(()->new ArrayList<>());

        List list3 = getList(aSupplier::get);
    }
    public static List getList(Supplier<List> aSupplier) {
        return aSupplier.get();
    }
}
