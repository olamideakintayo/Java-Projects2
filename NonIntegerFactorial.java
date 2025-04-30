// NonIntegerFactorial.java

import java.util.Scanner;

public class NonIntegerFactorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();

        long factorial = 1;

        if (n == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }

        System.out.println("The factorial of " + n + " is: " + factorial);

        input.close();
    }
}
