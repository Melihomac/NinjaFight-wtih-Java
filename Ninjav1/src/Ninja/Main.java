package Ninja;

public class Main {
	public static void main(String[] args) {
		Ninja blue = new Ninja("Blue");
		Ninja yellow = new Ninja("Yellow");
		int round = 1;
		while(blue.getHealthPoint()>0 && yellow.getHealthPoint()>0) {
			System.out.println("\nRound>>" + round);
			blue.Attack(yellow);
			yellow.Attack(blue);
			System.out.print(blue.toString());
			System.out.print(yellow.toString());
			round ++;
		}
		if(blue.getHealthPoint() > yellow.getHealthPoint()) {
			System.out.println("\n" + blue.getName() + " Has Won the Game !");
		}
		else if(blue.getHealthPoint() < yellow.getHealthPoint()) {
			System.out.println("\n" + yellow.getName() + " Has Won the Game !");
		}
	}
}