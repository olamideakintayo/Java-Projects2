import java.util.Scanner;

public class CreditCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String continueCheck = "yes";

        while (continueCheck.equalsIgnoreCase("yes")) {

            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits this month: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;

            System.out.println("New balance is: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("Within credit limit.");
            }

            System.out.print("Do you want to check another customer? (yes/no): ");
            input.nextLine(); 
            continueCheck = input.nextLine();
        }

        System.out.println("Program ended.");
    }
}
