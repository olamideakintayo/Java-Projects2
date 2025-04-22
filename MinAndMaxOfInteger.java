// MinAndMaxOfIntegers.java

import java.util.Scanner;

public class MinAndMaxOfInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the first integer: ");
	int num1 = input.nextInt();

	System.out.print("Please enter the second integer: ");
	int num2 = input.nextInt();

	int sum = num1 + num2;
	int product = num1 * num2;
	int average = num1 + num2 / 2;
	int distance = num1 - num2;

	System.out.printf("The sum of two integers: %d%n", sum);
	System.out.printf("The product of two integers: %d%n", product);
	System.out.printf("The avaerage of two integers: %d%n", average);
	System.out.printf("The distance of two integers: %d%n", distance);

	if (num1 < num2) {
	System.out.printf("Min integer: %d%n", num1);
	}

	if (num2 < num1) {
	System.out.printf("Min integer: %d%n", num2);
	}

	if (num1 > num2) {
	System.out.printf("Max integer: %d%n", num1);
	}

	if (num2 > num1) {
	System.out.printf("Max integer: %d%n", num2);
	}

}
}
	