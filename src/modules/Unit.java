package modules;

public abstract class Unit {
    private int health;
    private AttackMode attackMode;
    
    protected static enum AttackMode {
        FRIENDLY, OFFENSIVE, DEFENSIVE, BOSS
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Unit(AttackMode mode) {
        this.attackMode = mode;
        health = 5;
    }
    
    public AttackMode getAttackMode() {
        return attackMode;
    }
    
    public void setAttackMode(AttackMode mode) {
        this.attackMode = mode;
    }
    
    // Abstract methods that need to be implemented
    public abstract void action();
    public abstract boolean canMove();
    public abstract void move();
    public abstract boolean canAttack();
    public abstract void attack();    
}
