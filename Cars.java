/**
 * Class {@Cars} makes car objects
 * @author  Carl Wheat
 * @author Rosemary Davies
 * @since 8.01
 * Computer Science Foundations, Spring
 */


import java.util.*;

public class Car {

 // Part 1:

    // List of our fields

    private int position;
    private int gas;
    private int distance;

    // Default Constructor

    public Cars (int position, int gas, int distance){
        this.position = position;
        this.gas = gas;
        this.distance = distance;
    }


    // Method to print car objects
    public String toString() {
        String myStr = "";
        myStr = "position: %d \n";, this.position;
        myStr.concat("gas: %d \n";, this.gas);
        myStr.concat("distance: %d \n";, this.distance);
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

    public static int findTheWinnter(Cars cars[], int size){

    }

    // Method for car information:

    // Creates array about every car on the road, returns number of cars on road
    // -1 is sentinel
    public static int fillCarArray(Cars cars[], int maxsize){

    }

    // Prints information about every car
    public static void printCarArray(Cars cars[], int size){

    }

    // Prints log of travel for the winning car
    public static void log(Cars cars[], int size, int start){

    }

    // Returns next car on the road given current position
    public static Cars nextCar(Cars cars[], int currentPosition, int size){

    }

}

