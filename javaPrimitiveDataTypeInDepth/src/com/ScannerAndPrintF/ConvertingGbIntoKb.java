package com.ScannerAndPrintF;

import java.util.Scanner;

public class ConvertingGbIntoKb {



	// this class is sanner converting GB into KB
	public static void main(String[] args) {

	        Scanner s = new Scanner (System.in); // to read from the keyboard
	        System.out.println("Enter the value in (GB) :");
	        double giga = s.nextDouble();
	        double result = giga * 1024 * 1024 ;
	       // System.out.println("The value in (KB) :"+result);
	        System.out.println("The value of ("+giga+") GB is: "+result+" KB ");





	    }

}