// LargestInteger.java

import java.util.Scanner;

public class LargestInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the first integer: ");
	int num1 = input.nextInt();

	System.out.print("Please enter the second integer: ");
	int num2 = input.nextInt();

	if(num1 > num2) {
	System.out.printf("Result is: %d%n", num1);
	}

	if(num2 > num1) {
	System.out.printf("Result is: %d%n", num2);
	}

	if(num1 == num2) {
	System.out.printf("Result is: 0");
	}

	 if(num1 % 6 == num2 % 6) {
            if(num1 < num2) {
                System.out.println("Smallest value with same remainder: " + num1);
            }
            if(num2 < num1) {
                System.out.println("Smallest value with same remainder: " + num2);
            }
        }

        if(num1 % 6 != num2 % 6) {
            System.out.println("The values have different remainders when divided by 6.");
        }
}
}