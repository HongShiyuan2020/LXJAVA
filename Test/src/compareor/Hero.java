package compareor;


public class Hero implements Comparable{
    public int hp;
    public int ap;
    public String name;
    

    public Hero(int d, int e, String name) {
        this.hp = d;
        this.ap = e;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(hp);
    }

    @Override
    public int compareTo(Object o) {		
        if (hp < ((Hero)o).hp) {
            return -1;
        }else{
            return 1;
        }
    }
}
