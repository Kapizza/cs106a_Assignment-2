/*
 * File: Target.java
 * Name: Davit Gochitashvili
 * Section Leader: Davit Akopov
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	/** radius of first circle in centimeters */
	private static final double radius1 = 2.54;

	/** radius of second circle in centimeters */
	private static final double radius2 = 1.65;

	/** radius of third circle in centimeters */
	private static final double radius3 = 0.76;

	public void run() {
		// We have created first big red circle using GOval.
		drawCircle(radius1, Color.RED);
		// We have created second white circle using GOval.
		drawCircle(radius2, Color.WHITE);
		// We have created the last small circle using GOval.
		drawCircle(radius3, Color.RED);
	}

	/**
	 * This method draws circle in center of canvas; This method is passed
	 * radius(in centimeters) and color;
	 */

	private void drawCircle(double r, Color c) {
		double cm = 72 / 2.54; // This variable is for converting pixels in cm;
		double width = r * 2 * cm;
		double height = r * 2 * cm;
		GOval oval = new GOval(width, height);
		oval.setFilled(true);
		oval.setFillColor(c);
		oval.setColor(c);
		add(oval, (getWidth() - width) / 2, (getHeight() - height) / 2);

	}

}
