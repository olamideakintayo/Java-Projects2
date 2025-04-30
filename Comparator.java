// Comparator.java

import java.util.Scanner;

public class Comparator {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please Enter number 1: ");
	int num1 = input.nextInt();

	System.out.print("Please Enter Number 2: ");
	int num2 = input.nextInt();

	if(num1 == num2) {
	System.out.println("0");
	}

	if(num1 > num2) {
	System.out.println("1");
	}

	if (num2 > num1) {
	System.out.println("-1");
	}
}
}