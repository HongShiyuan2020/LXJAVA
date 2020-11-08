package compareor;

public class Item implements Comparable<Item>{
    public int value;

    public Item(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Item o) {
        if (value < o.value) {
            return -1;
        }else{
            return 1;
        }
    }
}
