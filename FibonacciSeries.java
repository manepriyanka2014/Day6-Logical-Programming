package com.logical;

import com.utility.Utility;

public class FibonacciSeries {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter number till you want to check Fibonacci Series :");
		int a = utility.getIntValue();
		utility.FibonacciSeries(a);
	}
}
