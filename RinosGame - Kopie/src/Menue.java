import java.util.Scanner;

public class Menue {

	public void menue1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("In meinem Spiel gibt es 3 T�ren. \nHinter 2 T�ren sind immer Geister, durch denen du get�tet wirst. \nEs gibt immer eine T�r �ber die du ins n�ste level kommst. \nViel Spa�! ");
	System.out.println("  ");
	System.out.println("M�chtest du noch eine runde spielen? \nja = 1 nein = 2 ");
	int weiter = sc.nextInt();
	
	if (weiter == 1) {
		System.out.println("Dr�cke 1 f�r Schwierigkeitsgrad Leicht (2 level)\nDr�cke 2 f�r Schwierigkeitsgrad Mittel (4 level)\nDr�cke 3 f�r Schwierigkeitsgrad Schwer (6 level)\nDr�cke 4 f�r Schwierigkeitsgrad Unm�glich (10 level) ");
		int eingabe = sc.nextInt();
		} else if (weiter == 2) {
		System.out.println("Ok, bis bald!");	
	}
	
	
	
	
	
	 }
	
	}
	

