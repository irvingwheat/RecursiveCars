import java.util.Scanner;
public class CarRoundTheBlock {
/*public static void findTheWinner (Car cars[], int size) {
 
}*/
  /*
  public static void fillCarArray() {
    
  }
  */
  
  public static String fillCarArray (Car cars[], int size) {

     Scanner input = new Scanner(System.in);
     
     for (int i = 0; i < size; ++i) {
        cars[i] = new Car();
        cars[i].gas = input.nextInt();
        cars[i].distance = input.nextInt();
        
        if (cars[i].gas == -1 || cars[i].distance == -1) {
           int numCars1 = cars.length;
           return "Number of Cars on the road: " + numCars1;
        }
        //cars[maxsize] = new Car(i, newInput, newInput2);
     }
     int numCars1 = cars.length;
     return "Number of Cars on the road: " + numCars1;
  }

 public static String printCarArray(){ //(Car cars[], int size) {
  return "I am a string";
 }
 
 /*
 public static void log (Car cars[], int size, int start) {
  
 }
 public static Car nextCar (Car cars[], int currentPosition, int size) {
 
 } */
}
