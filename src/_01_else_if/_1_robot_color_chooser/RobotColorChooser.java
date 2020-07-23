
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot ethan = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		String color = JOptionPane.showInputDialog("What color pen would you like to draw with?");

		ethan.penDown();
		ethan.setPenWidth(10);
		ethan.setSpeed(100);

		if (color.equalsIgnoreCase("red")) {

			ethan.setPenColor(255, 0, 0);

			for (int i = 0; i < 4; i++) {
				ethan.move(100);
				ethan.turn(90);

			}
		}

		else if (color.equalsIgnoreCase("blue")) {

			ethan.setPenColor(0, 102, 255);

			for (int i = 0; i < 4; i++) {
				ethan.move(100);
				ethan.turn(90);
			}
		}

		else if (color.equalsIgnoreCase("green")) {

			ethan.setPenColor(51, 204, 51);

			for (int i = 0; i < 4; i++) {
				ethan.move(100);
				ethan.turn(90);

			}
		}

		else if (color.equalsIgnoreCase("yellow")) {

			ethan.setPenColor(255, 255, 0);

			for (int i = 0; i < 4; i++) {
				ethan.move(100);
				ethan.turn(90);

			}
		}

		else {

			ethan.setPenColor(204, 0, 204);

			for (int i = 0; i < 4; i++) {
				ethan.move(100);
				ethan.turn(90);

			}

			JOptionPane.showMessageDialog(null, "Is purple okay?");

		}
	}
}
