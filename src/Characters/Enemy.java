package Characters;

public class Enemy extends Character implements Attacker {

    public Enemy(int hp, int dmg, int def){
        super(hp, dmg, def);
    }

    @Override
    public void attack() {

    }
}