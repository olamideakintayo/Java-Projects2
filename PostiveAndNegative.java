// PositiveAndNegative.java

import java.util.Scanner;

public class PostiveAndNegative {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the first integer: ");
	int num1 = input.nextInt();

	System.out.print("Please enter the second integer: ");
	int num2 = input.nextInt();

	if(num1 > 0 && num2 > 0) {
	int product = num1 * num2;
	System.out.println("Output is: " + product);
	}

	if(num1 < 0 && num2 < 0) {
	int product = num1 * num2;
	System.out.println("Output is: " + product);
	}

	if(num1 < 0 && num2 > 0) {
	int sum = num1 + num2;
	System.out.println("Output is: " + sum);
	}

	if(num1 > 0 && num2 < 0) {
	int sum = num1 + num2;
	System.out.println("Output is: " + sum);
	}
}
}





