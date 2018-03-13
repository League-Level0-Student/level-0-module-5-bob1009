/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String uppercase=JOptionPane.showInputDialog("what ur name kid");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
			System.out.println(uppercase.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number .of characters in the String.
					System.out.println(uppercase.length());	
		
	for (int i = 0; i < uppercase.length(); i++) {
		char c = uppercase.charAt(i);
		
		if (i%2==0) {
			c=Character.toUpperCase(c);
		}
		else {
			c=Character.toLowerCase(c);
		}
		goofyName+=c;
	}
	JOptionPane.showMessageDialog(null,"your goofy name is"+goofyName);		// 4. Create a String variable to store the next character of the name
			//    using .charAt(i)
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name

	}}


