package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random r = new Random();
		boolean reachedTop = false;
		Robot topRobot = null;
		Robot [] robotArray = new Robot [5];
		for (int i = 0; i < robotArray.length; i++) {
			robotArray[i] = new Robot();
			robotArray[i].setX(50+(i*100));
			robotArray[i].setY(400);
			robotArray[i].setAngle(0);
			robotArray[i].setSpeed(20);
		}
		while (!reachedTop) {
			for (int i = 0; i < robotArray.length; i++) {
				robotArray[i].move(r.nextInt(50));
			}
			for (int i = 0; i < robotArray.length; i++) {
				if (robotArray[i].getY() <= 0) {
					reachedTop = true;
					topRobot = robotArray[i];
				}
			}
		}
		topRobot.turn(360);
	}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.


			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		//7. declare that robot the winner and throw it a party!

		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

		}

