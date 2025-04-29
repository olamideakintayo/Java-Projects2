// AverageInteger.java

import java.util.Scanner;

public class AverageInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 0;
		int positive = 0;
		int negative = 0;

		int total = 0;
		double average = 0;

		
		while (true) {

			System.out.println("Please enter number" + ": ");
			int num = input.nextInt();

			if (num == 0) {
			break;
			}

			if (num >= 1) {
			positive ++;
			}

			if (num <= -1) {
			negative ++;
			}
			
			counter ++;
			total = total + num;
			 if (counter > 0) {
            		average = (double) total / counter;
      			  }

			
}
		System.out.println("The total number of positives is: " + positive);
		System.out.println("The total number of negatives is: " + negative);
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + average);
}
}