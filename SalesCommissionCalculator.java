// SalesCommissionCalculator

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        final double baseSalary= 200.0;
        final double commissionRate = 0.09;

        System.out.println("Enter the price of each item sold.");
        System.out.println("Type -1 when you're done.");

        double itemPrice = 0.0;

        while (true) {
            System.out.print("Enter item price: ");
            itemPrice = input.nextDouble();

            if (itemPrice == -1) {
                break;
            }

            totalSales += itemPrice;
        }

        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission;

        System.out.printf("Total earnings for the week: $%.2f%n", totalEarnings);

       
    }
}
