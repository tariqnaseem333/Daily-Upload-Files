package friday_17_nov;

public class Car {
	
//	Instance variable
    private String color;
	private static int numberOfCars = 0;    //static variable
	
//	Constructor
	public Car(String color) {
	   this.color = color;
	   numberOfCars++;
	}
	
//	Method
	public void displayColor() {
		System.out.println("Color of the car : "+this.color);
	}
	
//	Getters and Setters
	public String getColor() {       //static method
	    return this.color;
	}
	public static int getNumberOfCars() {
		return numberOfCars;
	}

}
