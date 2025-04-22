// ProductOfIntegers.java

import java.util.Scanner;

public class ProductOfIntegers {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the first integer: ");
	int num1 = input.nextInt();

	System.out.print("Please eneter the second integer: ");
	int num2 = input.nextInt();

	int product = num1 * num2;

	System.out.printf("The product of the values are: %d", product);

}
}