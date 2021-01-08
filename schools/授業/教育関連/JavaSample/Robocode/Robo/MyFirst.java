package jp.zenryoku.robo;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * MyFirst - a robot by (your name here)
 */
public class MyFirst extends Robot
{
	/**
	 * run: MyFirst's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			ahead(100);
			turnGunLeft(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(120);
		turnGunRight(360);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		double way = e.getBearing();
		System.out.println("onHitByBullet way: " + way);
		turnRight(90);
		ahead(100);
		turnLeft(90);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// oposit of wall
		double way = e.getBearingRadians() == 0 ? -180 : e.getBearingRadians();
		setWayTo(way);
		// Replace the next line with any behavior you would like
		ahead(100);
	}
	
	public void onHitRobot(HitRobotEvent e) {
		 setGunWayTo(e.getBearing());
		 fire(120);
		 scan();
	}

	private void setGunWayTo(double way) {
		System.out.println("setGunWayTo: " + way);
		if (way < 15) {
			turnGunLeft(way - 180);
		} else {
			turnGunRight(way + 180);
		}		
	}
	private void setWayTo(double way) {
		System.out.println("setWayTo: " + way);
		if (way > 15) {
			turnLeft(way - 180);
		} else {
			turnRight(way + 180);
		}
	}	
}
