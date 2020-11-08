package compareor;

public class Hero {
    public int hp;
    public int ap;
    public String name;

    public Hero(int hp, int ap, String name) {
        this.hp = hp;
        this.ap = ap;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name+" "+hp+" "+ap+"]";
    }
}
