// HighestIntegerCount.java

import java.util.Scanner;

public class HighestIntegerCount {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);

	int largest = -2354353;
	int counter = 0;
	int highestCounter = 0;

	while (counter != 65555) {
	System.out.print("Please enter number " + (counter + 1) + ":");
	int num = input.nextInt();
	input.nextLine();
	if (num > largest) {
	largest = num;
	highestCounter = 1;
	}
	else if (num == largest) highestCounter ++;
	counter ++;
	System.out.println("Do you wish to continue? Press stop to end the program or Press the Enter key to continue: ");
        String stop = input.nextLine();

        if (stop.equals("stop") || stop.equals("Stop")) {
             break;

}
}
	System.out.println("The largest integer is " + largest);
	if (highestCounter != 0) {
	System.out.println("The occurence count of the largest number is " + highestCounter);
	}

	


}
}
