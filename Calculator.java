 // Calculator.java

import java.util.Scanner;
import java.lang.Math;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String message = """
		A Mini Calculator
		Enter:
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Square root
		Press 0 to End the app
		""";

		mainMenu:
       	 	while (true) {
            	System.out.print(message);
            	System.out.print("Please Enter your preferred number from the options: ");
            	int mainMenuInput = input.nextInt();

		if (mainMenuInput == 0) {
                System.out.println("Goodbye!");
                break;
		}

		switch (mainMenuInput) {
                case 1:
                    Addition:
                    while (true) {
			System.out.println("ADDITION");
                        System.out.print("Please Enter the First Number: ");
                        double additionInput1 = input.nextDouble();
			
			System.out.print("Please Enter the Second Number: ");
                        double additionInput2 = input.nextDouble();

			double total = additionInput1 + additionInput2;
			System.out.println("The total is: " + total);
			
			System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue mainMenu;
                                }
                                break;  
			}
			
			case 2: 
			Subtraction:
                    while (true) {
			System.out.println("SUBTRACTION");
                        System.out.print("Please Enter the First Number: ");
                        double subtractionInput1 = input.nextDouble();
			
			System.out.print("Please Enter the Second Number: ");
                        double subtractionInput2 = input.nextDouble();

			double total = subtractionInput1 - subtractionInput2;
			System.out.println("The total is: " + total);
			
			System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue mainMenu;
                                }
                                break;   
			}
			
			case 3: 
			Multiplication:
                    while (true) {
			System.out.println("MULTIPLICATION");
                        System.out.print("Please Enter the First Number: ");
                        double multiplicationInput1 = input.nextDouble();
			
			System.out.print("Please Enter the Second Number: ");
                        double multiplicationInput2 = input.nextDouble();

			double total = multiplicationInput1 * multiplicationInput2;
			System.out.println("The total is: " + total);
			
			System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue mainMenu;
                                }
                                break;    
			}

			case 4: 
			Division:
                    while (true) {
			System.out.println("DIVISION");
                        System.out.print("Please Enter the First Number: ");
                        double divisionInput1 = input.nextDouble();
			
			System.out.print("Please Enter the Second Number: ");
                        double divisionInput2 = input.nextDouble();

			double total = divisionInput1 / divisionInput2;
			System.out.println("The total is: " + total);
			
			System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue mainMenu;
                                }
                                break;
                           
			}

			case 5:
			SquareRoot:
			while(true) {
			System.out.println("SQUARE ROOT");
			System.out.print("Please Enter the Number: ");
			double squareRootInput = input.nextDouble();

			double squareRoot = Math.sqrt(squareRootInput);
			System.out.println("The Square Root is: " + squareRoot);

			System.out.println("Press 0 to go back");
                                if (input.nextInt() == 0) {
                                    continue mainMenu;
                                }
                                break;

					}
            			}		


			}
}
}
