package programming_fall;
import java.util.ArrayList;
public class Carrr {


	class Vehicle {
	  String licensePlate;
	  
	  void print() {
	   
	  }
	}

	class Car extends Vehicle {
	  private float positionX;
	  private float  positionY;
	  private float  fuel;
	  static ArrayList<Car> availableCars = new ArrayList<>();
	  
	  
	  Car() {
	    this(0, 0, 0);
	  }
	  
	  Car(float  positionX) {
	    this(positionX, 0, 0);
	  }
	  
	  Car(float  positionX, float  positionY) {
	    this(positionX, positionY, 0);
	  }
	  
	  Car(float  positionX, float  positionY, float  fuel) {
	 
	    if (positionX < 0 || positionX > 150) {
	      System.out.println("Invalid value for positionX, setting to 0.0");
	      positionX = 0;
	    }
	    if (positionY < 0 || positionY > 150.0) {
	      System.out.println("Invalid value for positionY, setting to 0.0");
	      positionY = 0;
	    }
	    if (fuel < 0 || fuel > 30) {
	      System.out.println("Invalid value for fuel, setting to 0.0");
	      fuel = 0;
	    }
	    
	    this.positionX = positionX;
	    this.positionY = positionY;
	    this.fuel = fuel;
	    
	    availableCars.add(this);
	  }
	  
	
	  float  getPositionX() {
	    return positionX;
	  }
	  
	  float  getPositionY() {
	    return positionY;
	  }
	  
	  float  getFuel() {
	    return fuel;
	  }
	  
	  void print() {
	    System.out.println("Position: (" + positionX + ", " + positionY + ") Fuel: " + fuel);
	  }
	  
	  void fillFuel(float  f) {
	    fuel += f;
	    
	    
	    if (fuel > 30) {
	      fuel = 30;
	    } else if (fuel < 0) {
	      fuel = 0;
	    }
	  }
	  
	
	  void moveForward() {
	    if (fuel >= 0.5) {
	      positionX += 1.0;
	      fuel -= 0.5;
	    }
	  }
	  
	  void moveBackward() {
	    if (fuel >= 0.5) {
	      positionX -= 1.0;
	      fuel -= 0.5;
	    }
	  }
	  
	  void moveLeft() {
	    if (fuel >= 0.5) {
	      positionY += 1.0;
	      fuel -= 0.5;
	    }
	  }
	  
	  void moveRight() {
	    if (fuel >= 0.5) {
	      positionY -= 1.0;

	    }
	  }
	}
}
