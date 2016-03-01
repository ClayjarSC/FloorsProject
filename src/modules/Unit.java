package modules;

public abstract class Unit {
    private int health;
    private AttackMode attackMode;
    private Direction orientation;
    private Status status;
    private int moveSpeed;
    
    protected static enum AttackMode {
        FRIENDLY, OFFENSIVE, DEFENSIVE, BOSS
    }
    
    protected static enum Status {
        ACTIVE, DOWN, DEAD
    }

    public Unit(AttackMode mode) {
        this.attackMode = mode;
        health = 5;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public AttackMode getAttackMode() {
        return attackMode;
    }
    
    public void setAttackMode(AttackMode mode) {
        this.attackMode = mode;
    }
    
    public Direction getOrientation() {
        return orientation;
    }
    
    public void setOrientation(Direction orientation) {
        this.orientation = orientation;
    }
    
    public Status getStatus() {
        return status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    public int getSpeed() {
        return moveSpeed;
    }
    
    public void setSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    
    // Abstract methods that need to be implemented
    public abstract void action();
    public abstract boolean canMove();
    public abstract void move();
    public abstract boolean canAttack();
    public abstract void attack();
}
