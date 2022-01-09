import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int min = 1;
		int max = 3;
      
		Random random1 = new Random(); // generiert eine zufälige zahl zwischen 1 und 3 //Leicht
		int value1 = random1.nextInt(max + min);
		
		Random random2 = new Random();  //Mittel
		int value2 = random2.nextInt(max + min);
		
		Random random3 = new Random();  //Schwer
		int value3 = random3.nextInt(max + min);
		
		Random random4 = new Random();  //Unmöglich
		int value4 = random4.nextInt(max + min);
		
		
		Menue instance = new Menue();
		instance.menue1();
		
		//if (eingabe == 1) {
			
			
		//}

		// Getter und Setter Methoden
		
	
		
		
	

		}

	}
	

