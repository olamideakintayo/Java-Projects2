// RightAngledTriangle.java

import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base length of the triangle (between 1 and 10): ");
        int baseLength = input.nextInt();

        if (baseLength < 1 || baseLength > 10) {
            System.out.println("Error: Base length must be between 1 and 10.");
        } else {
            for (int row = 1; row <= baseLength; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
