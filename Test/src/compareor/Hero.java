package compareor;

public class Hero implements Comparable{
    public int hp;
    public int ap;
    public String name;
    private Hero o;

    public Hero(int hp, int ap, String name) {
        this.hp = hp;
        this.ap = ap;
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
