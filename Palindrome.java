// Palindrome.java

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);

	System.out.print("Please Enter a number to check if it's a Palindrome: ");
	int num = input.nextInt();


	int digit1;
	int digit2;
	int digit3;
	int digit4;

	while (true) {
	
	if (num < 10000 || num > 99999) {
	System.out.print("This Number is not a Palindrome Number");
	break;
	}

	else {
	digit1 = num / 10000;
	digit2 = (num / 1000) % 10;
	digit3 = (num / 10) % 10;
	digit4 = num % 10;

	if(digit1 == digit4 && digit2 == digit3) {
	System.out.print("This is a palindrome number");
	}
	
	else {
	System.out.print("This is not a palindrome number");
	}
	break;
	}
	
}
}
}