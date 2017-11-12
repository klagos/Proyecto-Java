import Characters.Enemy;
import Characters.Protagonist;

public class Game {
    public static void fight(Protagonist protagonist, Enemy enemy) {
        int turn = 0;
        while (!protagonist.dead() && !enemy.dead()) {
            if (turn == 0) {
                enemy.loseHp(protagonist.getDmg() - enemy.getDef());
                System.out.printf("Prota %d\n", protagonist.getHp());
                turn+=1;
            } else {
                protagonist.loseHp(enemy.getDmg() - protagonist.getDef());
                System.out.printf("Enemy %d\n", enemy.getHp());
                turn -= 1;
            }
        }
        if (protagonist.dead()) {
            System.out.println(protagonist.getClass().getName());
        }
        else{
            System.out.println(enemy.getClass().getName());
        }
    }
    public static void main(String[] args){
    Enemy bash = new Enemy(100, 15, 20);
    Protagonist kevin = new Protagonist(100,50,30);
    System.out.println(kevin.dead());
    Game.fight(kevin,bash);
    }
}