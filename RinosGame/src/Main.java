import java.util.Scanner;
import java.util.Random;

public class Main {
	
	int eingabe;
	int entscheidung;
	int entscheidung2;
	int dieZahl;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		menue1 instance = new menue1();
		instance.menue();
		
		int entscheidung;
		int entscheidung2;
		
		
		if (eingabe == 1) {
			System.out.println("Vor dir stehen 3 T�ren f�r welche entscheidest du dich? T�r 1, 2 oder 3? \n Level 1 von 2");
			int entscheidung = sc.nextInt();

			} else if (entscheidung == dieZahl) {
			    System.out.println("Sehr gut!\n Du bist ein Level weiter!");
			    System.out.println("Vor dir stehen 3 T�ren f�r welche entscheidest du dich? T�r 1, 2 oder 3? \n Level 2 von 2");
			    int entscheidung2 = sc.nextInt();
			    
			  }else if (entscheidung2 == dieZahl) {
			      System.out.println("Sehr gut!\n Du hast es geschafft!!!");
			      
			    }else {
			      System.out.println("Du wurdest gefressen! \n Versuche es gerne noch einmal.");
			    } 
		
		// Hier fehlt noch etwas, wird weitergemacht wenn der Rest �berhaupt funtioniert

		
		
		}
	
	
	public void random12() {
		
		int min = 1;
		int max = 3;
      
		Random random1 = new Random(); // generiert eine zuf�lige zahl zwischen 1 und 3 
		int dieZahl = random1.nextInt(max + min);
	}
	
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
	

