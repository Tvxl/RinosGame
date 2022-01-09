import java.util.Scanner;

public class Menue {

	public void menue1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("In meinem Spiel gibt es 3 Türen. \nHinter 2 Türen sind immer Geister, durch denen du getötet wirst. \nEs gibt immer eine Tür über die du ins näste level kommst. \nViel Spaß! ");
	System.out.println("  ");
	System.out.println("Möchtest du noch eine runde spielen? \nja = 1 nein = 2 ");
	int weiter = sc.nextInt();
	
	if (weiter == 1) {
		System.out.println("Drücke 1 für Schwierigkeitsgrad Leicht (2 level)\nDrücke 2 für Schwierigkeitsgrad Mittel (4 level)\nDrücke 3 für Schwierigkeitsgrad Schwer (6 level)\nDrücke 4 für Schwierigkeitsgrad Unmöglich (10 level) ");
		int eingabe = sc.nextInt();
		} else if (weiter == 2) {
		System.out.println("Ok, bis bald!");	
	}
	
	
	
	
	
	 }
	
	}
	

