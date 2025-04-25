//TwoHighestScore.java

import java.util.Scanner;

public class TwoHighestScore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Number of Students: ");
        int numberOfStudents = input.nextInt();

        int firstHighestScore = -23333;
        String firstHighestName = "";

        int secondHighestScore = -23333;
        String secondHighestName = "";

        for (int counter = 0; counter < numberOfStudents; counter++) {
            System.out.print("Please Enter the Student's Name: ");
            String studentName = input.next();

            System.out.print("Please Enter the Student's Score: ");
            int studentScore = input.nextInt();

            if (studentScore > firstHighestScore) {
                secondHighestScore = firstHighestScore;
                secondHighestName = firstHighestName;

                firstHighestScore = studentScore;
                firstHighestName = studentName;
            } else if (studentScore > secondHighestScore) {
                secondHighestScore = studentScore;
                secondHighestName = studentName;
            }
        }

             System.out.println(firstHighestName + " has the Highestscore of " + firstHighestScore);
        System.out.println(secondHighestName + " has the Second Highest score of " + secondHighestScore);
    }
}
