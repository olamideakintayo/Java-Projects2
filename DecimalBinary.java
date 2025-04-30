// DecimalBinary.java

import java.util.Scanner;

public class DecimalBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number (only 0s and 1s): ");
        int binaryNumber = input.nextInt();

        int decimalResult = 0;
        int position = 0;

        while (binaryNumber > 0) {
            int digit = binaryNumber % 10;
            decimalResult += digit * Math.pow(2, position);
            binaryNumber /= 10;
            position++;
        }

        System.out.println("Decimal equivalent is: " + decimalResult);
    }
}
