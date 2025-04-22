import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input a positive integer: ");
        int num = input.nextInt();

        for (int counter = 1; counter <= 50;counter = counter + 1) {
            System.out.println(num + " x " + counter + " = " + (num * counter));
        }
    }
}
