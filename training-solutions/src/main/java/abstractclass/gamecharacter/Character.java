package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint =100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    protected int getActualPrimaryDamage(){
        return random.nextInt(1,11);
    }

    private int getActualDefence(){
        return random.nextInt(6);
    }

    protected void hit (Character enemy, int damage){
        int actualDefence = enemy.getActualDefence();
        if(actualDefence < damage){
            enemy.decreseHitPoint(damage);
        }
    }

    private void decreseHitPoint(int diff){
        hitPoint -= diff;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character enemy);

    public boolean isAlive(){
        return hitPoint > 0;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }


}
