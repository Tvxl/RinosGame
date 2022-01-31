import java.util.Scanner;
import java.util.Random;

public class RinosSpiel {

	public static int generateRandomNumber() {
		int min = 1;
		int max = 3;

		Random random1 = new Random(); // generiert eine zufälige zahl zwischen 1 und 3

		int randomNumber = random1.nextInt(max) + min;

		return randomNumber;
	}

	public static void showMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Möchtest du noch eine runde spielen? \nja = 1 nein = 2 ");

		int weiter = sc.nextInt();

		if (weiter == 1) {
			System.out.println("Drücke 1 für Schwierigkeitsgrad Leicht (2 level)\n"
					+ "Drücke 2 für Schwierigkeitsgrad Mittel (4 level)\n"
					+ "Drücke 3 für Schwierigkeitsgrad Schwer (6 level)\n"
					+ "Drücke 4 für Schwierigkeitsgrad Unmöglich (8 level) ");
			int selectedLevel = sc.nextInt();

			playGame(selectedLevel * 2);
			showMenu();

		} else if (weiter == 2) {
			System.out.println("Ok, bis bald!");

		}
	}

	public static void playGame(int levelCount) { // wenn ich etwas aus einer anderen Klasse nehmen nöchte immer static benutzen
													
		Scanner sc = new Scanner(System.in);

		for (int counter = 0; counter < levelCount; counter++) {

			int entscheidung = 0;
			int zahl1 = generateRandomNumber();
			

			System.out.println("Vor dir stehen 3 Türen für welche entscheidest du dich? Tür 1, 2 oder 3?\n" + counter+1 
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
		System.out.println("In meinem Spiel gibt es 3 Türen.");
		System.out.println("Hinter 2 Türen sind immer Geister, die dich zum Fressen gern haben.");
		System.out.println("Es gibt immer eine Tür über die du ins nächste Level kommst.");
		System.out.println("Viel Spaß! \n\n");

		showMenu();

	}

}
