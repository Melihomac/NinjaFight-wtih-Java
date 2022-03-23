package Ninja;

public class Player {
    private int AttackPoint = 1;
    private int HealthPoint = 10;

    public int getHealthPoint() {
        return HealthPoint;
    }

    public int getAttackPoint() {
        return AttackPoint;
    }

    public int increaseAttack() {
        AttackPoint++;
        return AttackPoint;
    }

    public int decreaseHealth () {
        HealthPoint = HealthPoint - AttackPoint;
        return HealthPoint;
    }
}
