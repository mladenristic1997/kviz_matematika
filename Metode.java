package kviz_matematika;

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
		
		return Math.pow(a, -2);
	}
	//Stefan
	public static double kvadriranje(double a) {
		
		return Math.pow(a, 2);
	}
	
	public static void main(String[] args) {
		//Napravi Stefane switch da se nesto od ovoga nasumicno izabere
		System.out.println(mnozenje(3, 5));
		System.out.println(dijeljenje(6, 4));
		System.out.println(sabiranje(1, 1));
		System.out.println(oduzimanje(2, 4));
		System.out.println(korjenovanje(4));
		System.out.println(kvadriranje(5));
	}

}
