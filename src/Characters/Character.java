package Characters;

public abstract class Character{
    private int hp;
    private int dmg;
    private int def;
    Character(int hp, int dmg, int def){
        this.hp = hp;
        this.dmg = dmg;
        this.def = def;
    }
    public int getHp(){
        return hp;
    }
    public int getDmg(){
        return dmg;
    }
    public int getDef(){
        return def;
    }
    public void loseHp(int hpLoss) {
        if (hpLoss > 0)
            this.hp -= hpLoss;
    }
    public boolean dead() {
        return hp <= 0;
    }

    public String toString() {
        System.out.printf("hp: %d, dmg: %d, def: %d\n", hp, dmg, def);
        return getClass().getName();
    }
}