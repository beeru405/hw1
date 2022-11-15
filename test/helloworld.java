import java.io.PrintStream;
package com.aks;

public class Test1 {
	public statis void main(String[] args) {
		String results = Test.m1();
		System.out.println(results);
		String[] res = results.split(" ");
		if (res[0],equals("Hello")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}
}

