package generic;

import java.util.ArrayList;
import java.util.Collections;

import compareor.Hero;

public class Node<T extends Comparable> {
    public Node<T> LeftNode; 
    public Node<T> RightNode;
    public Object value;

    public void add(Object a) {
        if (value == null) {
            value = a;
        }else{
            if (Integer.parseInt(a.toString()) <= Integer.parseInt(value.toString())) {
                if (LeftNode == null) {
                    LeftNode = new Node<>();                    
                }
                LeftNode.add(a);
            }else{
                if (RightNode == null) {
                    RightNode = new Node<>();
                }
                RightNode.add(a);
            }
        }
    }

    public ArrayList<T> list() {
        ArrayList<T> arrayList = new ArrayList<>();

        if (LeftNode != null) {
            arrayList.addAll(LeftNode.list());
        }
        arrayList.add((T)value);
        if (RightNode != null) {
            arrayList.addAll(RightNode.list());
        }
        return arrayList;
    }
    public static void main(String[] args) {
        Node<Hero> aNode = new Node<>();
        aNode.add(new Hero(100, 100, "Hero1"));
        aNode.add(new Hero(10, 100, "Hero1"));
        aNode.add(new Hero(1023, 100, "Hero1"));
        aNode.add(new Hero(1003, 100, "Hero1"));
        aNode.add(new Hero(1002, 100, "Hero1"));
        ArrayList<Hero> arrayList = new ArrayList<>();
        arrayList = aNode.list();
        Collections.shuffle(arrayList);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
