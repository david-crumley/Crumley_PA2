package assignment_2_p2;

import java.util.Scanner;

/**
 * @author Guest123
 *
 */
public class assignment_2_p2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int height, weight, measurementChoice;
		double BMI = 0;
		measurementChoice = 0;
		while (measurementChoice != 1 && measurementChoice != 2)	{
			System.out.println ("Hello, please enter a 1 for metric(kilogram/meter) and a 2 for U.S. standard system(pound/inch).");
			measurementChoice = in.nextInt();
			if (measurementChoice != 1 && measurementChoice != 2)	{
				System.out.println("Not a valid input! Try again please");
			}
		}	
		System.out.println ("Now enter your weight followed by height with a space in between.");
		weight = in.nextInt();
		height = in.nextInt();
		
		if (measurementChoice == 1)	{
			BMI = (double)(weight)/(height * height);
		}
		else if (measurementChoice == 2)	{
			BMI = (double)(703 * weight) / (height * height);
		}
		System.out.printf("Your BMI is: %.2f\n",BMI);
		System.out.println("BMI categories:\n");
		System.out.printf("%-13s %s %s\n", "Underweight", "=", "<18.5");
		System.out.printf("%-13s %s %s\n", "Normal weight", "=", "18.5 - 24.9");
		System.out.printf("%-13s %s %s\n", "Overweight", "=", "25 - 29.9");
		System.out.printf("%-13s %s %s\n", "Obesity", "=", "greater than 30");
	
		in.close();
	}

}
