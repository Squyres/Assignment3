/*
 * RandomCircles.java
 * By: Jameson Squyres
 * This program will generate 10 circles with random size and color
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	// Set the amount of circles, minimum and maximum radius
	private static final int CIRCLES = 10;
	private static final double MIN_RADIUS = 5;
	private static final double MAX_RADIUS = 50;
	private RandomGenerator rgen = new RandomGenerator();
	// The for loop will run until it has drawn enough circles
	public void run() {
		for(int i = 0; i < CIRCLES; i++) {
			drawCircle();
		}
	}	// Randomize the radius within min and max, find the diameter, get random x and y within screen boundary, then get random color and add
	private void drawCircle() {
		double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double diameter = radius * 2;
		double x = rgen.nextDouble(0, getWidth() - diameter);
		double y = rgen.nextDouble(0, getHeight() - diameter);
		GOval circle = new GOval(x, y, diameter, diameter);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
}