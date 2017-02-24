public class Car {

 // Part 1:

    // List of our fields

    public int position;
    public int gas;
    public int distance;

    // Default Constructor

    public Car(int position, int gas, int distance){
        this.position = position;
        this.gas = gas;
        this.distance = distance;
    }
    public Car(){
        this.position = 0;
        this.gas = 0;
        this.distance = 0;
    }

    // Method to print car objects
    public String toString() {
        String myStr = "";
        myStr = "position: \n" + this.position;
        myStr.concat("gas: \n" + this.gas);
        myStr.concat("distance: \n" + this.distance);
        return myStr;

    }

    // Getters:

    public int getPosition() {
        return position;
    }

    public int getDistance() {
        return distance;
    }

    public int getGas() {
        return gas;
    }


    // Part 2:

    // Recursive function

    public static void findTheWinnter(Car cars[], int size){
        totalMiles += cars[carNumber].getDistance();
        if (cars[0].getGas() >= totalMiles) {
            System.out.print("1 is the winner");
        } else {
            gas += cars[carNumber].getGas();
            if (gas >= totalMiles) {
                System.out.println((carNumber+ 1) + " is the winner");
            } else {
                carNumber += 1;
                FindTheWinner()

            }
        }

    }

    // Method for car information:

    // Creates array about every car on the road, returns number of cars on road
    // -1 is sentinel
    public static void fillCarArray(Car cars[], int maxsize){

    }

    // Prints information about every car
    public static void printCarArray(Car cars[], int size){

    }

    // Prints log of travel for the winning car
    public static void log(Car cars[], int size, int start){

    }

    // Returns next car on the road given current position
    public static void nextCar(Car cars[], int currentPosition, int size){

    }

}
