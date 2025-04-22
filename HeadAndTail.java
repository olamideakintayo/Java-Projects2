// HeadAndTail.java

import java.util.Scanner;

public class HeadAndTail {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int coin = (int) (Math.random() * 2);

        System.out.print("Guess the coin flip (0 for heads, 1 for tails): ");
        int guess = input.nextInt();

        if (guess == coin && coin == 0) {
            System.out.printf("Correct! It was heads. %n");
        }

        if (guess == coin && coin == 1) {
            System.out.printf("Correct! It was tails.%n");
        }

        if (guess != coin && coin == 0) {
            System.out.printf("Incorrect. It was heads.%n");
        }

        if (guess != coin && coin == 1) {
            System.out.printf("Incorrect. It was tails.%n");
        }

}
}