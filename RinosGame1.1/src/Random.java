import java.util.Random;

public class Random {
	
	public static void random12() {
		
		int min = 1;
		int max = 3;
      
		Random random1 = new Random(); // generiert eine zufälige zahl zwischen 1 und 3 //Leicht
		int value1 = random1.nextInt(max + min);
		
	}

}
