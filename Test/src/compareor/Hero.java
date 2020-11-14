package compareor;

public class Hero implements Comparable {
    public int hp;
    public int ap;
    public String name;

    public Hero(int d, int e, String name) {
        this.hp = d;
        this.ap = e;
        this.name = name;
    }

    public void attac(Hero enemy) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        enemy.hp -= 100;
        System.out.println(enemy.name+" was hitted by "+this.name);
        if(enemy.hp <= 0){
            System.out.println(enemy.name+" was killed by "+this.name);
        }
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
