import java.util.scanner;
public class CarRoundTheBlock {
	public static int findTheWinner (Car cars[], int size) {
	
	}
	public static int fillCarArray (Car cars[], int maxsize) {
		int maxsize = 100;
		Scanner input = new Scanner(System.in);
		int i = 0;
		for (i = 0; i <= 100; ++i) {
			int newInput = input.nextInt();
			int newInput2 = input.nextInt();
			if (newInput == -1 || newInput2 == -1) {
				int numCars1 = cars.length;
				return numCars1;
			}
			Car cars[i] = new Car(i, newInput, newInput2);
			
		}
		int numCars = cars.length;
		return numCars;
	}
	public static void printCarArray (Car cars[], int size) {
		
	}
	public static void log (Car cars[], int size, int start) {
		
	}
	public static Car nextCar (Car cars[], int currentPosition, int size) {
	
	}
}
