// Difference.java

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the first integer: ");
	int num1 = input.nextInt();

	System.out.print("Please enter the second integer: ");
	int num2 = input.nextInt();

	if(num1 > num2) {
	int difference = num1 - num2;
	System.out.println("The difference is: " + difference);
	}
}
}
