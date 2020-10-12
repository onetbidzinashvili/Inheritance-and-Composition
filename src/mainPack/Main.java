package mainPack;

import robotPack.*;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotCoocker robotCoocker = new RobotCoocker();
		RobotDancer robotDancer = new RobotDancer();
		
		robot.work();
		coffeRobot.work();
		robotCoocker.work();
		robotDancer.work();
		
		// this code use polymorphism
		Robot[] robots = new Robot[4];
		robots[0] = robot;
		robots[1] = coffeRobot;
		robots[2] = robotCoocker;
		robots[3] = robotDancer;
		
		// this loop use index
		for (int i = 0; i < robots.length; i++) {
			robots[i].work();;
		}
		// this loop use link 
		for(Robot r : robots) {
			r.work();
		}
	}

}
