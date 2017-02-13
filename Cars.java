/*
* Project Description
*/

import java.util.*;

public class Car {

// Public or privtte?
int position;
int gas;
int distance;

// Constructor Car

public class Car (int position, int gas, int distance){
  this.position = position;
  this.gas = gas;
  this.distance = distance;
}

public String toString() {
// 
}

// Getters:

public int getPosition() {
  return this.position;
}

public int getDistance() {
  return this.distance;
}

public int getGas() {
  return this.gas;  
}

}
