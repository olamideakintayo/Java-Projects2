// Perpendicular.java

import java.util.Scanner;

public class PerpendicularAxis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x-coordinate for first point: ");
        int x1 = input.nextInt();

        System.out.print("Enter y-coordinate for first point: ");
        int y1 = input.nextInt();

        System.out.print("Enter x-coordinate for second point: ");
        int x2 = input.nextInt();

        System.out.print("Enter y-coordinate for second point: ");
        int y2 = input.nextInt();

        if (x1 == x2 || y1 == y2) {
            System.out.println("The points are on a line perpendicular to an axis.");
        } else {
            System.out.println("The points are not on a line perpendicular to an axis.");
        }
    }
}
