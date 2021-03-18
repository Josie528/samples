package exercise1;
import java.util.Scanner;

public class WeightOnMarsDemo {

	public static void main(String[] args) {
		
		WeightOnMars weightOnMars = new WeightOnMars();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter you weight here: ");
		// Use result of setEarthWeight
		weightOnMars.setEarthWeight(keyboard.nextDouble());
		
		System.out.println("Your weight on Mars is "+ 
		weightOnMars.getMarsWeight() +" kg.");
	}
}
