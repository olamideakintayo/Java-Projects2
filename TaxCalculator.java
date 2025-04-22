// TaxCalculator.java

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int counter = 0;
	int standardRate = 15;
	double result = 0;

	while ( counter != 3) {

	System.out.println("Please Enter the Citizen's Name: ");
	String name = input.next();

	System.out.println("Please Enter the Citizen's Earnings: ");
	double earnings = input.nextDouble();
	counter ++;

	
	if ( earnings <= 30000) {
	result = standardRate / 100.0 * earnings;
	} 
	
	else {
	double standardTax = 0.15 * 30000;
	double excessTax = 0.20 * (earnings - 30000);
	result = standardTax + excessTax;
	}
	System.out.println("The Total Tax for " + name + " is: "+ result);
}
	
}
}