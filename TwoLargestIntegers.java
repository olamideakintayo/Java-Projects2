// TwoLargestIntegers.java

import java.util.Scanner;

public class TwoLargestIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int number;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
