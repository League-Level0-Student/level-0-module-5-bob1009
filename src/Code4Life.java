
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import org.omg.CORBA.INTERNAL;

public class Code4Life {
	/*
	 * Ask the user how many hours they spent coding this week.
	 * 
	 * 
	 * 
	 * 
	 * 1. If it's 3 or more, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code
	 * instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */
	public static void main(String[] args) {
		String jeff = JOptionPane.showInputDialog("how many hours today have you typed this week?");
		int ansewer = Integer.parseInt(jeff);
		if (ansewer > (2)) {
			JOptionPane.showMessageDialog(null, "you are a CODE NINJA");

		}

		if (ansewer <= (2)) {
			JOptionPane.showMessageDialog(null, "stop watching yotube and start typing!!!!!!!!");
		}

		if (ansewer > (5)) {
			playBatmanTheme();
		}

	}

	private static void playBatmanTheme() {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}