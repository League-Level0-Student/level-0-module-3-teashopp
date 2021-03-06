
package _02_loop_variables._3_robot_walk_of_fame;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();

		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(50);
		rob.setY(50);
		rob.setSpeed(100);
		rob.hide();
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				rob.setPenColor(0, 153, 255);
				rob.penDown();
				for (int j = 0; j < 5; j++) {
					rob.move(30);
					rob.turn(144);
				}
			}

			else {
				rob.setPenColor(255, 51, 0);
				rob.penDown();
				for (int j = 0; j < 5; j++) {
					rob.move(30);
					rob.turn(144);
				}
			}
			rob.penUp();
			rob.moveTo(100 + i * 50, 50);
		}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
