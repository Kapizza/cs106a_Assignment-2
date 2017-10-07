/*
 * File: Hailstone.java
 * Name: Davit Gochitashvili
 * Section Leader: Davit Akopov
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {

	public void run() {
		int x = readInt("Enter number :");
		calculate(x);
	}

	/**
	 * Method calculate() makes "Hailstone" sequence process until reaches 1;
	 * calculate() is passed x; Also prints finish text if process was
	 * successful or warns user about problem;
	 */

	private void calculate(int x) {
		if (x > 0) {
			int counter = 0;
			while (x != 1) {
				counter++;
				x = checkNumber(x);
			}
			println("FINISH! This process took " + counter
					+ " steps to reach 1");
		} else {
			println("Please enter numbers above 0!");
		}
	}

	/**
	 * Method checkNumber checks and makes operations: if number is even divides
	 * by 2 and if number is odd takes 3n+1; checkNumber is passed x variable
	 * and it returns changed x;
	 */

	private int checkNumber(int x) {
		if (x % 2 == 0) {
			println("This number is even: " + x);
			x = x / 2;
			println("It will divided by 2 = " + x);
		} else {
			println("This number is odd: " + x);
			x = x * 3 + 1;
			println("It will be multiplied by 3 and added 1 = " + x);
		}
		return x;
	}

}
