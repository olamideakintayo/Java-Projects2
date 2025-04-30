// Exponential.java

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter the number of terms to calculate: ");
        int n = input.nextInt();

        double result = 1.0;  
        double factorial = 1.0;
        double powerOfX = 1.0;

        for (int i = 1; i < n; i++) {
            powerOfX *= x;       
            factorial *= i;     
            result += powerOfX / factorial;        
 }

        System.out.println("The estimated value of e^" + x + " using " + n + " terms is: " + result);
    }
}
