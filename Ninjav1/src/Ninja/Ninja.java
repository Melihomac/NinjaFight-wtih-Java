package Ninja;

import java.util.Random;

public class Ninja {

	private int healthPoint=3;
	private int attackPoint= 1;
	private String name;

	@Override
	public String toString() {
		String info="\n Name: " + name;
	    info +="\n Health Point: "+ healthPoint;
		info +="\n Attack Point: "+ attackPoint;
		return info;
	}

	public Ninja ( String name) {
		this.name= name;
	}

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	public String getName() {
		return name;
	}

    private boolean Defend(Ninja n) {
		Random r2 = new Random();
		int result2 = r2.nextInt(2);
		if(result2 == 0) {
			System.out.println("Attack successfully defended");
			return true;
		}
		else {
			this.healthPoint--;
		}

		return false;
	}

	public boolean Attack(Ninja n) {
		Random r = new Random();
		int result = r.nextInt(2);
		if(result == 0) {
			System.out.println(n.getName() + " Successfully Attacked ");
			return (n.Defend(this));
		}
		else if (result == 1) {
			System.out.println(n.getName() + " Attack Failed");
			return false;
		}
		return false;
	}
}
