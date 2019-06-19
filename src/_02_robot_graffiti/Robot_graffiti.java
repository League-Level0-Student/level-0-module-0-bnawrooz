package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robot_graffiti {
public static void main(String[] args) {
	Robot behzad=new Robot();
	behzad.moveTo(250, 50);
	behzad.setSpeed(100);
	behzad.turn(180);
	behzad.penDown();
	behzad.move(300);
	behzad.turn(270);
	behzad.move(50);
	for (int i = 0; i < 6; i++) {
		behzad.move(40);
		behzad.turn(-30);
	}
	behzad.move(40);
	behzad.turn(180);
	for (int i = 0; i < 6; i++) {
		behzad.move(40);
		behzad.turn(-30);
	}
	behzad.move(100);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}




