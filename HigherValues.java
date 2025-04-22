// HigherValues.java

import java.util.Scanner;

public class HigherValues {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the first integer: ");
	int num1 = input.nextInt();

	System.out.print("Please enter the second integer: ");
	int num2 = input.nextInt();

	System.out.print("Please enter the third integer: ");
	int num3 = input.nextInt();

	if(num2 > num1 && num3 > num2) {
	System.out.println("The result is: True");
	}

	if(num2 < num1 && num3 < num2) {
	System.out.println("the result is: False");
	}

	if(num2 > num1 && num3 < num2) {
	System.out.println("the result is: False");
	}

}
}


