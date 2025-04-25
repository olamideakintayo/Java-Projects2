// HighestScore.java

import java.util.Scanner;

public class HighestScore {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Please Enter the Number of Students: ");
	int numberOfStudents = input.nextInt();

	int num = -232444;
	String studentName = " ";
	int studentScore;

	for(int counter = 0; counter < numberOfStudents; counter ++) {
	System.out.print("Please Enter the Student's Name: ");
	studentName = input.next();

	System.out.print("Please Enter the Student's Score: ");
	studentScore = input.nextInt();
	
	if (studentScore > num) num = studentScore;
	}
	System.out.print(studentName + " is the student with the Highest Score of " + num);
	
}
}

	
	

	