/*
 * File: ProgramHierarchy.java
 * Name: Davit Gochitashvili
 * Section Leader: Davit Akopov
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;

public class ProgramHierarchy extends GraphicsProgram {
	/** Width of each square in pixels */
	private static final int SQUARE_WIDTH = 120;

	/** Height of each square in pixels */
	private static final int SQUARE_HEIGHT = 60;

	public void run() {
		drawDiagram();
	}

	/**
	 * Method drawDiagram draws diagrams using boxes (with texts inside) and
	 * lines connecting them; In this method is used switch-case statement to
	 * change texts in boxes;
	 */
	private void drawDiagram() {
		String str = "";
		for (int i = 0; i < 3; i++) {
			switch (i + 1) {
			case 1:str = "GraphicsProgram";break;
			case 2:str = "ConsoleProgram";break;
			case 3:str = "DialogProgram";break;
			}
			int x = (getWidth() - SQUARE_WIDTH) * (i * 2 + 1) / 6;
			int y = (getHeight() - SQUARE_HEIGHT) * 2 / 3;
			drawBox(str, x, y);
		}
		int x = (getWidth() - SQUARE_WIDTH) * 3 / 6;
		int y = (getHeight() - SQUARE_HEIGHT) / 3 * 1;
		drawBox("Program", x, y);
		connectBoxes(x, y);
	}

	/**
	 * Method connectBoxes draw 3 lines to connect boxes; This method is passed
	 * coordinates to align lines correctly;
	 */

	private void connectBoxes(int x, int y) {
		for (int i = 0; i < 3; i++) {
			int a = (getWidth() - SQUARE_WIDTH) * (i * 2 + 1) / 6
					+ SQUARE_WIDTH / 2;
			int b = (getHeight() - SQUARE_HEIGHT) * 2 / 3;
			drawLine(x + SQUARE_WIDTH / 2, y + SQUARE_HEIGHT, a, b);
		}
	}

	/**
	 * Method drawBox draws rectangle of given width and height; This method is
	 * passed coordinates of location and string to write it inside rectangle;
	 * Text will be written in the center of rectangle;
	 */
	private void drawBox(String text, int x, int y) {
		GRect rect = new GRect(SQUARE_WIDTH, SQUARE_HEIGHT);
		add(rect, x, y);
		GLabel label = new GLabel(text);
		double textX = x + SQUARE_WIDTH / 2 - label.getWidth() / 2;
		double textY = (y + SQUARE_HEIGHT / 2 + label.getAscent() / 2);
		add(label, textX, textY);
	}

	/**
	 * This method just draws line; It is passed start and end points;
	 */

	private void drawLine(int x, int y, int a, int b) {
		GLine line = new GLine(x, y, a, b);
		add(line);
	}
}
