package kviz_matematika;
import java.util.Random;
public class Metode {
	//Mladen
	public static double sabiranje(double a, double b) {
		
		return a + b;
	}
	//Mladen
	public static double oduzimanje(double a, double b) {
			
			return a - b;
		}
	//Eldin
	public static double mnozenje(double a, double b) {
		
		return a * b;
	}
	//Eldin
	public static double dijeljenje(double a, double b) {
		
		return a / b;
	}
	//Stefan
	public static double korjenovanje(double a) {
		
		return Math.pow(a, 1.0/2);
	}
	//Stefan
	public static double kvadriranje(double a) {
		
		return Math.pow(a, 2);
	}
	
	public static void main(String[] args) {
		//Napravi Stefane switch da se nesto od ovoga nasumicno izabere
		Random rand = new Random();
		int br = rand.nextInt(6);
		switch (br){
		case 0:System.out.println(mnozenje(3, 5)); break;
		case 1:System.out.println(dijeljenje(6, 4));break;
		case 2:System.out.println(sabiranje(1, 1)); break;
		case 3:System.out.println(oduzimanje(2, 4));break;
		case 4:System.out.println(korjenovanje(4)); break;
		case 5:System.out.println(kvadriranje(5)); break;
		default: System.out.println("Pogresan unos.");
		}
		
	}

}
