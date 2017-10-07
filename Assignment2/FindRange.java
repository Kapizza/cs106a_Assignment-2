/*
 * File: FindRange.java
 * Name: Davit Gochitashvili
 * Section Leader: Davit Akopov
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	/** Specifies the value of the sentinel */
	private static final int SENTINEL = 0;

	public void run() {
		findNumbers();
	}

	/**
	 * This method asks user to enter numbers; If enter number equals to
	 * Sentinel program finds the smallest and largest integers and prints them;
	 */
	private void findNumbers() {
		int min = 0;
		int max = 0;
		int i = readInt("Enter Number: ");
		max = min = i;
		while (i != SENTINEL) {
			i = readInt("Enter Number: ");
			if (i == SENTINEL) {
				break;
			}
			if (i >= max) {
				max = i;
			}
			if (i <= min) {
				min = i;
			}
		}
		print(max, min);
	}

	/**
	 * Method print() prints results of calculations or error, if invalid number
	 * is entered; This method is passed minimal and maximal values to print
	 * them;
	 */
	private void print(int m, int n) {
		if (m == 0) {
			println("Please enter number which is not 0!");
		} else {
			println("Largest: " + m);
			println("Smallest: " + n);
		}
	}

}
