package com.ScannerAndPrintF;

import java.util.Scanner;

public class ScannerType {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in); // means can read from the keyboard(user)
		int x = s.nextInt(); // user can type a number
		// double x = s.nextDouble(); // user can type such as 50.2
		// String x = s.next(); // user can type here text
		// boolean x = s.nextBoolean(); // reads true or false

		System.out.println("The value is : " + x);
	}


}
//next() reads only the first word and stops after space
//nextln() read full line and stops at next line
