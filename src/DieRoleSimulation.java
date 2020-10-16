import java.util.Scanner;

public class DieRoleSimulation {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		boolean keepRolling = true;

		System.out.println("Welcome to the Grand Circus Casino!\n");
		
		while (keepRolling) {
			int sidesInput = Validator.getInt(scnr, "Enter the number of sides for the die: ");

			int dieOneValue = generateRandomDieRoll(sidesInput);
			int dieTwoValue = generateRandomDieRoll(sidesInput);

			System.out.println("You rolled a " + dieOneValue + " and a " + dieTwoValue);
			
			crapsMessages(dieOneValue, dieTwoValue);
			

			keepRolling = Validator.getYesNo(scnr, "Roll again? (yes/no)? ");
		}
		System.out.println("Thanks for playing!");
		scnr.close();

	}

	private static int generateRandomDieRoll(int dieRoll) {
		int die;
		die = (int) (Math.random() * dieRoll + 1);
		return die;
	}
	private static void crapsMessages(int dieRoll1, int dieRoll2) {
		if (dieRoll1 == 1 && dieRoll2 == 1) {
			System.out.println("Snake Eyes!");
		}else if (dieRoll1 == 6 && dieRoll2 == 6) {
			System.out.println("Box Cars!");
		}else if ((dieRoll1 + dieRoll2 == 7) || (dieRoll1 + dieRoll2 == 11)) {
			System.out.println("Craps! You're a Winner!");
		}
	}
	
}
