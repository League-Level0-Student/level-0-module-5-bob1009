import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		// 1. Create a robot
		Robot jeff = new Robot();
		// 2. Set the speed to 100
		jeff.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "choose a color please",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "red", "green", "blue" }, 0);

		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		if (colorChoice == 0) {
			jeff.setPenColor(Color.RED);

		}

		if (colorChoice == 1) {
			jeff.setPenColor(Color.GREEN);
		}
		if (colorChoice == 2) {
			jeff.setPenColor(Color.BLUE);
		}
		
		Robot.setWindowSize(1500, 1500);
		jeff.moveTo(200, 200);
		jeff.penDown();
		// 4. Ask the use how many polygons they want to be drawn.
		String question = JOptionPane.showInputDialog("how many polygon do you want to make");
		int ansewer = Integer.parseInt(question);
		// 5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < ansewer; i++) {
			
			
			jeff.move(75);
			jeff.turn(120);
			jeff.move(75);
			jeff.turn(120);
			jeff.move(75);
			jeff.penUp();
			jeff.setAngle(90);
			jeff.move(150);
			jeff.penDown();
		if(jeff.getX()>1250) {
		jeff.moveTo(400, 400);
	
			
			
		}
		}

	
	// 6. Make it so your shapes do not overlap

	// 7. Challenge: add more colors to the Option Dialog.
}}
