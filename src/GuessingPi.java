

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {

		// 1. Make a main method and make sure your program can run

		// 2. Make a String variable to hold the value of Pi.
		String value = "3.1415926535";
		// 3. Print out the first 3 digits of Pi to the console.
		System.out.print(value.charAt(0));
		System.out.print(value.charAt(1));
		System.out.print(value.charAt(2));
		System.out.print(value.charAt(3));
		// The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		// Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		// put a for loop around steps 4-8.
		
		for (int i = 4; i < 12; i++) {
			
		
	String question=JOptionPane.showInputDialog("what is the "+i+"th digit of pi?");
		if (question.equals(""+value.charAt(i))) {
			JOptionPane.showMessageDialog(null,"CORRECT!!!!!!!!!!!!!!!!");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "nope");
		break;
		}
		}
		// 4. Create a for loop that will step through each digit of pi (steps 5-8)
		// NOTE: The number of digits in your string will be
		// yourStringVariable.length()

		// 5. Ask the user for the NEXT digit of pi.

		// 6. Compare the user's input to the next digit of your pi variable
		// (look at step 3 for a clue).
		// HINT: use charAt(0) to get 1st char of user input String

		// 7. If they are correct, print out "correct".

		// 8. If they are not, print out "incorrect" and tell them
		// to start over. Use 'break;' to break out of the loop.

	}
}
