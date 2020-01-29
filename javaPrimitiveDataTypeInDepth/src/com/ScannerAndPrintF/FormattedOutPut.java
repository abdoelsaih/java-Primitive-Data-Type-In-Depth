package com.ScannerAndPrintF;

public class FormattedOutPut {

	public static void main(String[] args) {
		double x = 22.0 / 7;
		int y = 55;
		// System.out.printf("%10.3f", y); // it means will skip 10 space from the left
		// System.out.printf("%.3f", x); // printf is to print formatted outputs
		// System.out.printf("%-10.3f", x); // it means will skip 10 space from the
		// right
		// System.out.printf("%010.3f", x); // 0 here means output will have zeros on
		// System.out.printf("%(.3f", -x); // this means will print it within ()
		// the left
		// System.out.printf("%+.3f", -x); // output here will have - or + in front the
		// number
		// System.out.printf("Value is %+.3f", -x); // output includes a text
		System.out.printf("Value is %.3f The next number %d The third number is %d", x, y, 20);
		// printf takes 2 attributes , %,3f" means show third number ; example 3.123

	}


}
