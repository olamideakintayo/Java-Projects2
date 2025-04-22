// RockPaperScissor.java

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	int random = (int) (Math.random() * 3);

	String[] pick = {"Scissor", "Rock", "paper"}; 
	System.out.print("Please Enter a number between 0-2: ");
	int num = input.nextInt();
	
	if (num == random) {
	System.out.println("The computer is: " + pick[random]);
	System.out.println("You are: " + pick[num]);
	System.out.println("It is a draw");
	}
	
	else {
	if ((num == 0 && random == 2) ||
	(num == 1 && random == 0) ||
	(num == 2 && random == 1) ) {
	System.out.println("The computer is: " + pick[random]);
	System.out.println("You are: " + pick[num]);
	System.out.println("You won!!");
	}

	else{

	if ((num != 0 && random != 2) ||
	(num != 1 && random != 0)||
	(num != 2 && random != 1)) {
	System.out.println("The computer is: " + pick[random]);
	System.out.println("You are: " + pick[num]);
	System.out.println("You lost!!");
	}
}

}
}
}