// TheLargestInteger.java

import java.util.Scanner;

public class TheLargestInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int counter = 0;

	int largest = -98987;

	while (counter != 10) {

	System.out.print("Please enter number " + (counter + 1) + ": ");
	int num = input.nextInt();

	if (num > largest) largest = num;
	counter ++;

}

	System.out.print("The largest integer is: " + largest);
}
}