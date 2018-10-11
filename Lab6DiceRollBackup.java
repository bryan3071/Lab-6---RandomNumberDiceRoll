package RandomNumberLab6DiceRoll;
import java.util.Random;
import java.util.Scanner;

public class Lab6DiceRollBackup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();
		askUser();
		
	}
	
	public static void askUser() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many sides should each die have?");
		System.out.println();
		int sides = scnr.nextInt();
		
		System.out.println("You have selected a " + sides + " sided die" );
		askFirstRoll(sides);
		int dice1 = generateRandomDieRoll(sides);
		int dice2 = generateRandomDieRoll(sides);
		scnr.close();
	}
	
	public static void askFirstRoll(int sides) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Do You Want To Roll The Dice Yes or No?");
		//String wantToRollOne = scnr.next();
		
		if (scnr.next().equals("y")) {
			// System.out.println("Test");// generateRandomDieRoll(sides);
		
		}
	}
	private static int generateRandomDieRoll(int sides) {
		int dice = (int)(Math.random() * sides)+1;
		
		
		{
			if (dice < 6)
				System.out.print(sides+" Resulting in craps");
			else System.out.println(dice);
			return dice;
		}
		

	}

}
