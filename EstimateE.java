// EstimateE.java

import java.util.Scanner;

public class EstimateE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate e: ");
        int num = input.nextInt();

        double e = 1.0;
        long factorial = 1;

        for (int i = 1; i < num; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }

        System.out.println("The estimated value of e using " + num + " terms is: " + e);

    }
}
