import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
      System.out.println("5 6 -1");

    System.out.println(mycar);
    System.out.println(mycar.getPosition() + " gas " + mycar.getGas() + " distance " + mycar.getDistance());
    */
    // can't do this carRoundTheBlock case1 = new carRoundTheBlock();

    // new car object Car mycar = new Car();
    /*

    carArray[0] = new Car(); // THIS IS THE IMPORTANT PIECE
    carArray[0].position = 4;
    System.out.println(carArray[0].getPosition());
    */
      
    Scanner scnr = new Scanner(System.in);
    int size;
    System.out.println("What size array would you like?");
    
    size = scnr.nextInt();
    Car[] carArray = new Car[size];
    System.out.println(CarRoundTheBlock.fillCarArray(carArray,size));
    for(int i = 0; i < size; i++) {
      System.out.println("car #" + i + " has gas enough for " + carArray[i].gas + " miles, distance to neighbor " + carArray[i].distance + " miles"); 
      //System.out.println("Gas: " + carArray[i].gas); 
      //System.out.println("Distance: " + carArray[i].distance); 
    }
    int total = 0;
    int totalMiles = 0;
    arrayLength = carArray.length;
    for (i = 0; i <= arrayLength; ++i) {
      totalMiles = carArray[i].distance + totalMiles;
    }
    for (i = 0; i <= arrayLength; ++i) {
      total = total + carArray[i].gas;
      if (total >= totalMiles) {
        System.out.println(i + " is the winner");
      }
    }
    
    // Recursive?
    
    public static int findTheWinner (Car cars[ ], int size) {
      int theWinner = 0;
      
      // Base case
      if (size == 1) {
        if (total < totalMiles) { // Check if total traveled is more than or equal to distance around Circle
        return 0; // There is no winner
        }
        else {
          theWinner = car[].position; // Total traveled is equal to or greater than Circle distance
          return theWinner;
        }
      }
      // Recursive case
      else {
        if (cars[0].gas > cars[0].distance) {
            cars[0].gas += cars[0+1].gas;
            cars[0].distance += cars[i+1].distance;
            cars[0].distance % totalMiles;
        }
        return findTheWinner(carArray[NEW VALUE], size-1); // Recursive case
    }
      }
    
    public static int Winner (int distance) {
      if (distance <= 0) {
        System.out.print("Winner")
      } else {
          
    }
      //return theWinner;
    
    
    // test System.out.println(CarRoundTheBlock.printCarArray());
    return;
    }
}
