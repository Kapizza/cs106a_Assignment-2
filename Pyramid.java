/*
 * File: Pyramid.java
 * Name: Davit Gochitashvili
 * Section Leader: Davit Akopov
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		drawPyramid();
	}

	/**
	 * This method draws rows of bricks for each bricks in base; In every next
	 * row there is one less brick, so when this method is done, bricks will
	 * shape of pyramid;
	 */
	private void drawPyramid() {
		for (int i = 0; i < BRICKS_IN_BASE; i++) {
			int row = BRICKS_IN_BASE - i;
			drawRow(row, i);
		}
	}

	/**
	 * This method Draws row of bricks; This method is passed number of bricks
	 * in row and number of which row is it to set correct coordinates;
	 */

	private void drawRow(int a, int b) {
		for (int j = 0; j < a; j++) {
			GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
			int x = (getWidth() / 2 - (a * BRICK_WIDTH) / 2) + j * BRICK_WIDTH;
			int y = getHeight() - b * (BRICK_HEIGHT) - BRICK_HEIGHT;
			add(brick, x, y);
		}
	}
}
