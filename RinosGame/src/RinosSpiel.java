import java.util.Scanner;
import java.util.Random;

public class RinosSpiel {

	public static int generateRandomNumber() {
		int min = 1;
		int max = 3;

		Random random1 = new Random(); // generiert eine zuf�lige zahl zwischen 1 und 3

		int randomNumber = random1.nextInt(max) + min;

		return randomNumber;
	}

	public static void showMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("M�chtest du noch eine runde spielen? \nja = 1 nein = 2 ");

		int weiter = sc.nextInt();

		if (weiter == 1) {
			System.out.println("Dr�cke 1 f�r Schwierigkeitsgrad Leicht (2 level)\n"
					+ "Dr�cke 2 f�r Schwierigkeitsgrad Mittel (4 level)\n"
					+ "Dr�cke 3 f�r Schwierigkeitsgrad Schwer (6 level)\n"
					+ "Dr�cke 4 f�r Schwierigkeitsgrad Unm�glich (8 level) ");
			int selectedLevel = sc.nextInt();

			playGame(selectedLevel * 2);
			showMenu();

		} else if (weiter == 2) {
			System.out.println("Ok, bis bald!");

		}
	}

	public static void playGame(int levelCount) { // wenn ich etwas aus einer anderen Klasse nehmen n�chte immer static benutzen
													
		Scanner sc = new Scanner(System.in);

		for (int counter = 0; counter < levelCount; counter++) {

			int entscheidung = 0;
			int zahl1 = generateRandomNumber();
			

			System.out.println("Vor dir stehen 3 T�ren f�r welche entscheidest du dich? T�r 1, 2 oder 3?\n" + counter+1 
								+ " von " + levelCount + "- cheat with " + zahl1);
			entscheidung = sc.nextInt();

			if (entscheidung == zahl1) {
				// the user was right for the door
				System.out.println("Sehr gut!\nDu bist ein Level weiter!");
				//System.out.println(levelCount);


			} else if (counter == levelCount-1 ) {
				System.out.println("Du hast Gewonnen!!!");
	
			} else {
				System.out.println("Du wurdest gefressen! \nVersuche es gerne noch einmal.");
				break; // spring aus der Schleife heraus

			} 

		}
	}

	public static void main(String[] args) {
		System.out.println("In meinem Spiel gibt es 3 T�ren.");
		System.out.println("Hinter 2 T�ren sind immer Geister, die dich zum Fressen gern haben.");
		System.out.println("Es gibt immer eine T�r �ber die du ins n�chste Level kommst.");
		System.out.println("Viel Spa�! \n\n");

		showMenu();

	}

}
