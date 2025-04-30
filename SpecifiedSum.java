// SpecifiedSum.java

import java.util.Scanner; 

public class SpecifiedSum {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please Enter a number: ");
	int specifiedNum = input.nextInt();


	
	int sum = 0;

	while(sum < specifiedNum) {
	System.out.print("Please Enter a number: ");
	int num = input.nextInt();
	sum += num;	 	
}
	System.out.println("The total sum " + sum + " is greater than or equal to " + specifiedNum + ".");
}
}

	