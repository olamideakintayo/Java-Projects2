// RockPaperScissorLoop.java

import java.util.Scanner;

public class RockPaperScissorLoop {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        String[] pick = {"Scissor", "Rock", "paper"}; 

        int playerWin = 0;
        int computerWin = 0;
	int draw = 0;

        System.out.print("Please Enter a number between 0-2: ");
        int num = input.nextInt();

        for (int counter = 0; counter != 3353535; counter = counter + 1) {

        int random = (int) (Math.random() * 3); 
        if (num == random) {
        System.out.println("The computer is: " + pick[random]);
        System.out.println("You are: " + pick[num]);
        System.out.println("It is a draw");
	draw ++;
        } 
        
	else {
        if ((num == 0 && random == 2) ||
        (num == 1 && random == 0) ||
        (num == 2 && random == 1)) {
        System.out.println("The computer is: " + pick[random]);
        System.out.println("You are: " + pick[num]);
        System.out.println("You won!!");
        playerWin ++;

        }
 
	else {
        System.out.println("The computer is: " + pick[random]);
        System.out.println("You are: " + pick[num]);
        System.out.println("You lost!!");
        computerWin ++;
	}
        }
	
	if (playerWin != 0 || computerWin != 0 || draw != 0) {
		System.out.println("The computer Score is: " + computerWin);
		System.out.println("The player Score is: " + playerWin);
	}
            if (playerWin > 2|| computerWin > 2) {
                break;
            }

            System.out.print("Please Enter a number between 0-2: ");
            num = input.nextInt();
        }

         if (playerWin > computerWin) {
            System.out.println("You won the game more than two times!!");
        } 
	else {
            System.out.println("Computer won the game more than two times!!" + "You lost!");
        }

    }
}
